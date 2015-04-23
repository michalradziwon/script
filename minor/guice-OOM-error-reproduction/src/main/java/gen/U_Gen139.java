
  package gen;
  public class U_Gen139 {
  		@com.google.inject.Inject
  		public U_Gen139(U_Gen140 u_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  