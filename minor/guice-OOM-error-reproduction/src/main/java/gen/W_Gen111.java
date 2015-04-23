
  package gen;
  public class W_Gen111 {
  		@com.google.inject.Inject
  		public W_Gen111(W_Gen112 w_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  