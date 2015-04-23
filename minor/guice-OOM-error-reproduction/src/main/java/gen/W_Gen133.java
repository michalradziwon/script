
  package gen;
  public class W_Gen133 {
  		@com.google.inject.Inject
  		public W_Gen133(W_Gen134 w_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  