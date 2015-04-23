
  package gen;
  public class W_Gen50 {
  		@com.google.inject.Inject
  		public W_Gen50(W_Gen51 w_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  