
/**
 * <b> NOT IMPLEMENTED: Implementation still in progress </b>
 * <p>
 * Sorry that the file is located in the main directory, but ...
 * it is used to generate java files that allows to reproduce
 * OutOfMemoryError bug in Guice.
 * </p>
 */
object SrcGenerator {
  def generateFile(classname: String) = s"""
  package gen;
  public class ${classname} {
  		public ${classname}(){
  			System.out.println(this.getClass().getCanonicalName() + " created.");
  		}
  
  }
  """
  def saveFile(relativePath: String, content: String) = Some(new java.io.PrintWriter(relativePath)).foreach { p => p.write(content); p.close }
  def main(args: Array[String]) {
    val numberOfGeneratedClasses = 4000;
    val SRC_DIR = "./src/main/java/gen/"
      
    // generate dependencies
    (1 to numberOfGeneratedClasses)
    	.map(e => s"Gen${e}")
    	.map(clazz => (clazz + ".java", generateFile(clazz)))
    	.foreach{case (filename, content) => saveFile(SRC_DIR + filename, content)}
    
    // generate class using them
    saveFile(SRC_DIR + "GenClient.java", s"""
package gen;
//@com.google.inject.Singleton // we can comment it, since it does not load eagerly for non-DEV env.
public class GenClient{"""
+ (1 to numberOfGeneratedClasses).map(no => s"""	@com.google.inject.Inject
	public void inject${no}(Gen${no} gen${no}){
		System.out.println("injecting " + gen${no}.getClass().getCanonicalName());
    }""").mkString("\n") + 
    """
}
        """)
    
  }
}