
/**
 * <b> NOT IMPLEMENTED: Implementation still in progress </b>
 * <p>
 * Sorry that the file is located in the main directory, but ...
 * it is used to generate java files that allows to reproduce
 * OutOfMemoryError bug in Guice.
 * </p>
 */
object SrcGenerator {
  val SRC_DIR = "./src/main/java/gen/"
    
  def generateFile(classname: String, dependencies: List[String]) = s"""
  package gen;
  public class ${classname} {
  		@com.google.inject.Inject
  		public ${classname}(${dependencies.map(d => d + " " + d.toLowerCase()).mkString(", ")}){
  			System.out.println(this.getClass().getCanonicalName() + " created. " ${if (!dependencies.isEmpty) ("+ " + dependencies.head.toLowerCase()) else ""} );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  """
  def saveFile(relativePath: String, content: String) = Some(new java.io.PrintWriter(relativePath)).foreach { p => p.write(content); p.close }
  def main(args: Array[String]) {
    val numberOfGeneratedClasses = 200;
    val groups = ('A' to 'Z').map(_.toString() + "_").map(groupPrefix=>generateGroup(groupPrefix, numberOfGeneratedClasses))
    
        saveFile(SRC_DIR + "HasReferenceToAllGroups.java", s"""
package gen;
public class HasReferenceToAllGroups {"""
      + groups.zip(1 to Int.MaxValue ).map{case(clazz,no) => s"""	@com.google.inject.Inject
	public void inject${no}(${clazz} ${clazz.toLowerCase()}){
		System.out.println("HasReferenceToAllGroups #${no} injecting " + ${clazz.toLowerCase()});
    }"""}.mkString("\n") +
      """
}
        """)
        
  }
  def generateGroup(groupPrefix: String, numberOfGeneratedClasses: Int) = {
    // generate dependencies
    (1 to numberOfGeneratedClasses)
      .map(e => (s"${groupPrefix}Gen${e}", (if (e == numberOfGeneratedClasses) List() else List(s"${groupPrefix}Gen${e + 1}"))))
      .map { case (clazz, dependencies) => (clazz + ".java", generateFile(clazz, dependencies)) }
      .foreach { case (filename, content) => saveFile(SRC_DIR + filename, content) }

    val className = groupPrefix + "GenClient"
    // generate class using them
    saveFile(SRC_DIR + className+".java", s"""
package gen;
//@com.google.inject.Singleton // we can comment it, since it does not load eagerly for non-DEV env.
public class ${groupPrefix}GenClient{"""
      + (1 to numberOfGeneratedClasses).map(no => ((1 to 10).map(innerSeq=>s"""	@com.google.inject.Inject
	public void _${innerSeq}_inject${no}(${ groupPrefix + "Gen" + no} gen${no}){
		System.out.println("injecting " + gen${no}.getClass().getCanonicalName());
    }""")).mkString("\n")).mkString("\n") +
      """
    
    
}
        """)
    className
  }
}