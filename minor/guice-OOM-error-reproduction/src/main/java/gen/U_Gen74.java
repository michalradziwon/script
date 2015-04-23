
  package gen;
  public class U_Gen74 {
  		@com.google.inject.Inject
  		public U_Gen74(U_Gen75 u_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  