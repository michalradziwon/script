
  package gen;
  public class U_Gen88 {
  		@com.google.inject.Inject
  		public U_Gen88(U_Gen89 u_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  