
  package gen;
  public class P_Gen89 {
  		@com.google.inject.Inject
  		public P_Gen89(P_Gen90 p_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  