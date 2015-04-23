
  package gen;
  public class W_Gen191 {
  		@com.google.inject.Inject
  		public W_Gen191(W_Gen192 w_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  