
  package gen;
  public class P_Gen168 {
  		@com.google.inject.Inject
  		public P_Gen168(P_Gen169 p_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  