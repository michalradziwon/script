
  package gen;
  public class W_Gen68 {
  		@com.google.inject.Inject
  		public W_Gen68(W_Gen69 w_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  