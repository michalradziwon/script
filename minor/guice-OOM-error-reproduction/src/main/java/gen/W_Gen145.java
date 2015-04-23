
  package gen;
  public class W_Gen145 {
  		@com.google.inject.Inject
  		public W_Gen145(W_Gen146 w_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  