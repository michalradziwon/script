
  package gen;
  public class W_Gen88 {
  		@com.google.inject.Inject
  		public W_Gen88(W_Gen89 w_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  