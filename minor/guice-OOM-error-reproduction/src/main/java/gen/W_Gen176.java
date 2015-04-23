
  package gen;
  public class W_Gen176 {
  		@com.google.inject.Inject
  		public W_Gen176(W_Gen177 w_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  