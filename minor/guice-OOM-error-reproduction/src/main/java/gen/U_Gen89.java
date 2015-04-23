
  package gen;
  public class U_Gen89 {
  		@com.google.inject.Inject
  		public U_Gen89(U_Gen90 u_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  