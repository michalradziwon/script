
  package gen;
  public class W_Gen182 {
  		@com.google.inject.Inject
  		public W_Gen182(W_Gen183 w_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  