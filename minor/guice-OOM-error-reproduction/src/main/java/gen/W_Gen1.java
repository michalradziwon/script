
  package gen;
  public class W_Gen1 {
  		@com.google.inject.Inject
  		public W_Gen1(W_Gen2 w_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  