
  package gen;
  public class P_Gen131 {
  		@com.google.inject.Inject
  		public P_Gen131(P_Gen132 p_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  