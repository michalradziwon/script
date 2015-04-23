
  package gen;
  public class U_Gen77 {
  		@com.google.inject.Inject
  		public U_Gen77(U_Gen78 u_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  