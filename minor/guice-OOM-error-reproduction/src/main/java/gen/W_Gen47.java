
  package gen;
  public class W_Gen47 {
  		@com.google.inject.Inject
  		public W_Gen47(W_Gen48 w_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  