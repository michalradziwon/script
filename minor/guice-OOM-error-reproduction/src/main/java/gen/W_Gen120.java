
  package gen;
  public class W_Gen120 {
  		@com.google.inject.Inject
  		public W_Gen120(W_Gen121 w_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  