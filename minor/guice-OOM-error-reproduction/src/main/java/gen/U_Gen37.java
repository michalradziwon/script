
  package gen;
  public class U_Gen37 {
  		@com.google.inject.Inject
  		public U_Gen37(U_Gen38 u_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  