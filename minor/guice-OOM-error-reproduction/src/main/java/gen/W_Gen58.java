
  package gen;
  public class W_Gen58 {
  		@com.google.inject.Inject
  		public W_Gen58(W_Gen59 w_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  