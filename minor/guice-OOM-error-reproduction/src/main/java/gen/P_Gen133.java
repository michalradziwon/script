
  package gen;
  public class P_Gen133 {
  		@com.google.inject.Inject
  		public P_Gen133(P_Gen134 p_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  