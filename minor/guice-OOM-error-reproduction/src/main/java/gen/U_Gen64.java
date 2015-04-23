
  package gen;
  public class U_Gen64 {
  		@com.google.inject.Inject
  		public U_Gen64(U_Gen65 u_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  