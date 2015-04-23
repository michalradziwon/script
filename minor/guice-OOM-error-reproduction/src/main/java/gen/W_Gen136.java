
  package gen;
  public class W_Gen136 {
  		@com.google.inject.Inject
  		public W_Gen136(W_Gen137 w_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  