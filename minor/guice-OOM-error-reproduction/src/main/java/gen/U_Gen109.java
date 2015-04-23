
  package gen;
  public class U_Gen109 {
  		@com.google.inject.Inject
  		public U_Gen109(U_Gen110 u_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  