
  package gen;
  public class W_Gen99 {
  		@com.google.inject.Inject
  		public W_Gen99(W_Gen100 w_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  