
  package gen;
  public class W_Gen109 {
  		@com.google.inject.Inject
  		public W_Gen109(W_Gen110 w_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  