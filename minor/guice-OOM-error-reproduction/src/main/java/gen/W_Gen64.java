
  package gen;
  public class W_Gen64 {
  		@com.google.inject.Inject
  		public W_Gen64(W_Gen65 w_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  