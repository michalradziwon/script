
  package gen;
  public class U_Gen122 {
  		@com.google.inject.Inject
  		public U_Gen122(U_Gen123 u_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  