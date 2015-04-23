
  package gen;
  public class W_Gen132 {
  		@com.google.inject.Inject
  		public W_Gen132(W_Gen133 w_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  