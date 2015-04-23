
  package gen;
  public class W_Gen168 {
  		@com.google.inject.Inject
  		public W_Gen168(W_Gen169 w_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  