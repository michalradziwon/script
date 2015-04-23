
  package gen;
  public class U_Gen46 {
  		@com.google.inject.Inject
  		public U_Gen46(U_Gen47 u_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  