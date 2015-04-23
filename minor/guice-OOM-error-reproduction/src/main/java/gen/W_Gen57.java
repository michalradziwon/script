
  package gen;
  public class W_Gen57 {
  		@com.google.inject.Inject
  		public W_Gen57(W_Gen58 w_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  