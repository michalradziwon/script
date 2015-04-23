
  package gen;
  public class U_Gen36 {
  		@com.google.inject.Inject
  		public U_Gen36(U_Gen37 u_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  