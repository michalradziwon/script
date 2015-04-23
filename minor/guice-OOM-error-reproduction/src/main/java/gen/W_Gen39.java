
  package gen;
  public class W_Gen39 {
  		@com.google.inject.Inject
  		public W_Gen39(W_Gen40 w_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  