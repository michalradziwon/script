
  package gen;
  public class W_Gen131 {
  		@com.google.inject.Inject
  		public W_Gen131(W_Gen132 w_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  