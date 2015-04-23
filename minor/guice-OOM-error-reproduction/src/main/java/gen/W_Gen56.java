
  package gen;
  public class W_Gen56 {
  		@com.google.inject.Inject
  		public W_Gen56(W_Gen57 w_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  