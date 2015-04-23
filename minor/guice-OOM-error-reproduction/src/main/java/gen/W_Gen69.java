
  package gen;
  public class W_Gen69 {
  		@com.google.inject.Inject
  		public W_Gen69(W_Gen70 w_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  