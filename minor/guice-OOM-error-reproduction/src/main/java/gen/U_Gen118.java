
  package gen;
  public class U_Gen118 {
  		@com.google.inject.Inject
  		public U_Gen118(U_Gen119 u_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  