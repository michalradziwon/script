
  package gen;
  public class W_Gen83 {
  		@com.google.inject.Inject
  		public W_Gen83(W_Gen84 w_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  