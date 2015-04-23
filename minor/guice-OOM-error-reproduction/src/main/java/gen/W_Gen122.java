
  package gen;
  public class W_Gen122 {
  		@com.google.inject.Inject
  		public W_Gen122(W_Gen123 w_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  