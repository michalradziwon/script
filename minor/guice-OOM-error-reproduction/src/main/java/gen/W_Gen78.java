
  package gen;
  public class W_Gen78 {
  		@com.google.inject.Inject
  		public W_Gen78(W_Gen79 w_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  