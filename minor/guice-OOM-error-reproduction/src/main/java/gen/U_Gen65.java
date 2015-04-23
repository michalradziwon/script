
  package gen;
  public class U_Gen65 {
  		@com.google.inject.Inject
  		public U_Gen65(U_Gen66 u_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  