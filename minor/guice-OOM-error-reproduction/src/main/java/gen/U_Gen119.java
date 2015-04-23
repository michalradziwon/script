
  package gen;
  public class U_Gen119 {
  		@com.google.inject.Inject
  		public U_Gen119(U_Gen120 u_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  