
  package gen;
  public class W_Gen12 {
  		@com.google.inject.Inject
  		public W_Gen12(W_Gen13 w_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  