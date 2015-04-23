
  package gen;
  public class W_Gen89 {
  		@com.google.inject.Inject
  		public W_Gen89(W_Gen90 w_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  