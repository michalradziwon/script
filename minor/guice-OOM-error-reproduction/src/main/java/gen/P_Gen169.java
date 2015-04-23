
  package gen;
  public class P_Gen169 {
  		@com.google.inject.Inject
  		public P_Gen169(P_Gen170 p_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  