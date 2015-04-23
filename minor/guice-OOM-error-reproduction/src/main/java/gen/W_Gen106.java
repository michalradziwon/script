
  package gen;
  public class W_Gen106 {
  		@com.google.inject.Inject
  		public W_Gen106(W_Gen107 w_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  