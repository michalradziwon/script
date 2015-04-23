
  package gen;
  public class W_Gen169 {
  		@com.google.inject.Inject
  		public W_Gen169(W_Gen170 w_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  