object ConvertFieldsToGetters {
  def main(args: Array[String]) = {
    runTests();

    val input = """
    """

    input.split("\r\n").map(convertToGetterIfPossible(_)).foreach(println(_))
  }

  def convertToGetterIfPossible(line: String) = {

    analyse(line) match {
      case None => line
      case Some((typee, name)) => "public " + typee + " " + mapFieldNameToGetter(name, typee) + """(){
	 	return TODO; 
	 	}"""
    }

  }

  def mapFieldNameToGetter(field: String, typee: String) = {
    if (typee.toLowerCase == "boolean") "is" + field.head.toString.toUpperCase + field.tail
    else "get" + field.head.toString.toUpperCase + field.tail
  }

  def analyse(in: String) = {
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
      // println("Act " + act)
      // println("Exp " + exp)
      assert(exp == act, { println("Actual:" + act) })
    }
    testEq(analyse("""public Date                              myDateField;"""),
      Some(("Date", "myDateField")))
    testEq(analyse("""public List<TypeOne>      myList         = new ArrayList<TypeOne>();"""),
      Some(("List<TypeOne>", "myList")))
    testEq(analyse("""    public double                            doubleField;"""),
      Some(("double", "doubleField")))
    testEq(analyse("""@Documentation("Just documentation line.")"""),
      None)

    testEq(convertToGetterIfPossible("""@Documentation("Doc 123.")"""),
      """@Documentation("Doc 123.")""")
    testEq(convertToGetterIfPossible("""    public double                            doubleField;"""),
      """public double getDoubleField(){
	 	return TODO; 
	 	}""")

  }
}