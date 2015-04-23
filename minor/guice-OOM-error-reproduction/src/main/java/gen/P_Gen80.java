
  package gen;
  public class P_Gen80 {
  		@com.google.inject.Inject
  		public P_Gen80(P_Gen81 p_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  