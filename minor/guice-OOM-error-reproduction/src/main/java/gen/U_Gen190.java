
  package gen;
  public class U_Gen190 {
  		@com.google.inject.Inject
  		public U_Gen190(U_Gen191 u_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  