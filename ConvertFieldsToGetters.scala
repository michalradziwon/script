object ConvertFieldsToGetters {
  def main(args: Array[String]) = {
    // runTests();

    val input = """

  @Documentation("The doc1.")
  public My my;

  @Documentation("The doc2.")
  public int value; 
    """

    def convertAllPublicFieldsToGetters(lines : Seq[String]) = lines.map(convertToGetterIfPossible(_))
    def convertAllFieldAssignmentToGetterMocking(lines : Seq[String]) = lines.map(convertFieldAssignmentToGetterMocking(_))

    // Select the commend here:
    val command = convertAllPublicFieldsToGetters _
    val lines = input.split("\n")
    // Executes a given command and prints it to std out:
    command(lines).foreach(println(_))

  }

  def convertFieldAssignmentToGetterMocking(line: String) = {
    lookForAssignment(line) match {
      case None => line
      case Some((variable, field, value)) => s"when($variable.${mapFieldNameToGetter(field, None)}()).thenReturn($value);"
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
//      println("Act " + act + "\nExp " + exp)
      assert(exp == act, { println("Exp   : " + exp); println("Actual: " + act) })
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

  }
}