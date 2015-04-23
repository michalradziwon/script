
  package gen;
  public class W_Gen80 {
  		@com.google.inject.Inject
  		public W_Gen80(W_Gen81 w_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  