
  package gen;
  public class U_Gen141 {
  		@com.google.inject.Inject
  		public U_Gen141(U_Gen142 u_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  