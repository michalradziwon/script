
  package gen;
  public class P_Gen88 {
  		@com.google.inject.Inject
  		public P_Gen88(P_Gen89 p_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  