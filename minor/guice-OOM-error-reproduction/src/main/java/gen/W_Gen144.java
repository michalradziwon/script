
  package gen;
  public class W_Gen144 {
  		@com.google.inject.Inject
  		public W_Gen144(W_Gen145 w_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  