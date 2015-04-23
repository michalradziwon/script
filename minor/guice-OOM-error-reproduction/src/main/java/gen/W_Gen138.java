
  package gen;
  public class W_Gen138 {
  		@com.google.inject.Inject
  		public W_Gen138(W_Gen139 w_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  