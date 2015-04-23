
  package gen;
  public class W_Gen2 {
  		@com.google.inject.Inject
  		public W_Gen2(W_Gen3 w_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  