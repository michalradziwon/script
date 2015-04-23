
  package gen;
  public class L_Gen169 {
  		@com.google.inject.Inject
  		public L_Gen169(L_Gen170 l_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  