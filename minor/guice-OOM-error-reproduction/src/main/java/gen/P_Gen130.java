
  package gen;
  public class P_Gen130 {
  		@com.google.inject.Inject
  		public P_Gen130(P_Gen131 p_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  