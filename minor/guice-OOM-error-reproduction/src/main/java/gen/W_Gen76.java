
  package gen;
  public class W_Gen76 {
  		@com.google.inject.Inject
  		public W_Gen76(W_Gen77 w_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  