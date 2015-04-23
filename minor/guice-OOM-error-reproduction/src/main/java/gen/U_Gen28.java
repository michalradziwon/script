
  package gen;
  public class U_Gen28 {
  		@com.google.inject.Inject
  		public U_Gen28(U_Gen29 u_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  