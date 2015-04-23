
  package gen;
  public class W_Gen130 {
  		@com.google.inject.Inject
  		public W_Gen130(W_Gen131 w_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  