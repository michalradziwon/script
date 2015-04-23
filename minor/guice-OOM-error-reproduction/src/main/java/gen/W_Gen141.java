
  package gen;
  public class W_Gen141 {
  		@com.google.inject.Inject
  		public W_Gen141(W_Gen142 w_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  