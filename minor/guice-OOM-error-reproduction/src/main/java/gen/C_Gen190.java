
  package gen;
  public class C_Gen190 {
  		@com.google.inject.Inject
  		public C_Gen190(C_Gen191 c_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  