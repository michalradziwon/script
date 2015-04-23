
  package gen;
  public class U_Gen83 {
  		@com.google.inject.Inject
  		public U_Gen83(U_Gen84 u_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  