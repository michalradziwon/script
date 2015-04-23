
  package gen;
  public class W_Gen46 {
  		@com.google.inject.Inject
  		public W_Gen46(W_Gen47 w_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  