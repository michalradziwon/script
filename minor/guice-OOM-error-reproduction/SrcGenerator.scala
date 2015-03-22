
/**
 * <b> NOT IMPLEMENTED: Implementation still in progress </b>
 * <p>
 * Sorry that the file is located in the main directory, but ...
 * it is used to generate java files that allows to reproduce
 * OutOfMemoryError bug in Guice.
 * </p>
 */
object SrcGenerator {
  def generateFile(classname: String) = throw new NotImplementedError()
  def saveFile(relativePath: String, content: String) = Some(new java.io.PrintWriter(relativePath)).foreach { p => p.write(content); p.close }
  def main(args: Array[String]) {
    (1 to 2).map(e => s"Gen${e}").map(clazz => (clazz + ".java", generateFile(clazz))).foreach{case (filename, content) => saveFile(filename, content)}
  }
}