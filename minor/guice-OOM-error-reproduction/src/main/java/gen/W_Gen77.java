
  package gen;
  public class W_Gen77 {
  		@com.google.inject.Inject
  		public W_Gen77(W_Gen78 w_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  