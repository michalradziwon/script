
  package gen;
  public class W_Gen27 {
  		@com.google.inject.Inject
  		public W_Gen27(W_Gen28 w_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  