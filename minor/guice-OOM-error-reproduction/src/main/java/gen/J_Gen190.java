
  package gen;
  public class J_Gen190 {
  		@com.google.inject.Inject
  		public J_Gen190(J_Gen191 j_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  