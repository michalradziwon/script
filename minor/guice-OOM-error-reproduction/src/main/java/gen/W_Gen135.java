
  package gen;
  public class W_Gen135 {
  		@com.google.inject.Inject
  		public W_Gen135(W_Gen136 w_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  