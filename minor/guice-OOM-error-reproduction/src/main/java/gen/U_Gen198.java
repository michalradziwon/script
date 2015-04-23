
  package gen;
  public class U_Gen198 {
  		@com.google.inject.Inject
  		public U_Gen198(U_Gen199 u_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  