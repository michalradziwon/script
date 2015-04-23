
  package gen;
  public class U_Gen131 {
  		@com.google.inject.Inject
  		public U_Gen131(U_Gen132 u_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  