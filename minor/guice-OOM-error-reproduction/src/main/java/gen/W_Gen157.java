
  package gen;
  public class W_Gen157 {
  		@com.google.inject.Inject
  		public W_Gen157(W_Gen158 w_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  