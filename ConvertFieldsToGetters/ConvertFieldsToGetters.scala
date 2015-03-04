object ConvertFieldsToGetters {
  def main(args: Array[String]) = {
    runTests();

    val input = """

  @Documentation("The doc1.")
  public My my;

  @Documentation("The doc2.")
  public int value; 

  @Test
  public void shouldTestSomething() {
    some.code();
  }
    """

    def convertAllPublicFieldsToGetters(lines : Seq[String]) = lines.map(convertToGetterIfPossible(_))
    def convertAllFieldAssignmentToGetterMocking(lines : Seq[String]) = lines.map(convertFieldAssignmentToGetterMocking(_))
    // createTestMethodCommentsBasedOnTestMethodName

    // Select the commend here:
    val command = createTestMethodCommentsBasedOnTestMethodName _
    val lines = input.split("\r\n").toList
    // Executes a given command and prints it to std out:
    command(lines).foreach(println(_))


  }

  def createTestMethodCommentsBasedOnTestMethodName(lines : List[String]) = {
    lines.zip(""::lines).map(withPrev=>if(withPrev._2.contains("@Test")) List(createTestMethodComment(withPrev._1), withPrev._1) else if(withPrev._1.contains("@Test")) List() else List(withPrev._1)).flatten
  }

  def createTestMethodComment(methodSignatureLine : String) = {
    val comment = lookForMethodNameInSignatureAssignment(methodSignatureLine).get.toList.map(i=>if(i.isUpper) " " + i.toLower else i).mkString.trim.capitalize + "."
    s"""
  /**
   * ${comment} 
   */
   @Test"""
 }
  

  def convertFieldAssignmentToGetterMocking(line: String) = {
    lookForAssignment(line) match {
      case None => line
      case Some((variable, field, value)) => s"when($variable.${mapFieldNameToGetter(field, None)}()).thenReturn($value);"
    }
  }

  def lookForMethodNameInSignatureAssignment(signatureLine: String) = {
    val Line = """\s*(\w*)\s+void\s+([\w]+).*""".r
    try {
      val Line(typee, methodName) = signatureLine
      Some(methodName)
    } catch {
      case _: Throwable => None
    }
  }
  

  def lookForAssignment(in: String) = {
    val Line = """\s*([\w]+)\.([\w]+) = ([^;]+).*""".r
    try {
      val Line(variable, field, value) = in
      Some((variable, field, value))
    } catch {
      case _: Throwable => None
    }
  }

  def convertToGetterIfPossible(line: String) = {
    lookForFieldDefinition(line) match {
      case None => line
      case Some((typee, name)) => "public " + typee + " " + mapFieldNameToGetter(name, Some(typee)) + """(){
	 	return TODO; 
	 	}"""
    }

  }

  def mapFieldNameToGetter(field: String, typee: Option[String]) = {
    if (!typee.isEmpty && typee.get.toLowerCase == "boolean") "is" + field.head.toString.toUpperCase + field.tail
    else "get" + field.head.toString.toUpperCase + field.tail
  }

  def lookForFieldDefinition(in: String) = {
    val Line = """\s*public\s+([\w\<\>]+)\s*(\w+)[\s;].*""".r
    try {
      val Line(ttype, name) = in
      Some((ttype, name))
    } catch { // ugly -- FIXME later with matcher
      case _: Throwable => None
    }
  }

  def runTests() {
    def testEq(act: Object, exp: Object) {
     // println("Act " + act + "\nExp " + exp + "\n" + (""+act).length + "/" + (""+exp).length)
      assert(exp == act, { println("Exp   : '" + exp+"'"); println("Actual: '" + act + "'") })
    }

    testEq(lookForFieldDefinition("""public Date                              myDateField;"""),
      Some(("Date", "myDateField")))
    testEq(lookForFieldDefinition("""public List<TypeOne>      myList         = new ArrayList<TypeOne>();"""),
      Some(("List<TypeOne>", "myList")))
    testEq(lookForFieldDefinition("""    public double                            doubleField;"""),
      Some(("double", "doubleField")))
    testEq(lookForFieldDefinition("""@Documentation("Just documentation line.")"""),
      None)

    testEq(convertToGetterIfPossible("""@Documentation("Doc 123.")"""),
      """@Documentation("Doc 123.")""")
    testEq(convertToGetterIfPossible("""    public double                            doubleField;"""),
      """public double getDoubleField(){
	 	return TODO; 
	 	}""")

    testEq(lookForAssignment("""    myVar.fieldOne = newValueProvider.getX();"""),
      Some(("myVar", "fieldOne", "newValueProvider.getX()")))
    testEq(convertFieldAssignmentToGetterMocking("""    myVar.fieldOne = newValueProvider.getX();"""),
      """when(myVar.getFieldOne()).thenReturn(newValueProvider.getX());""")

    testEq(lookForMethodNameInSignatureAssignment("  public void shouldReturnPendingReportCodesBySystemDate() {"),
      Some("shouldReturnPendingReportCodesBySystemDate"))

    testEq(createTestMethodComment("""public void shouldReturnCorrectStateForPendingReport() {"""),
      """
  /**
   * Should return correct state for pending report. 
   */
   @Test""")
  }
}