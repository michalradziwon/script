
  package gen;
  public class U_Gen106 {
  		@com.google.inject.Inject
  		public U_Gen106(U_Gen107 u_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  