
  package gen;
  public class W_Gen187 {
  		@com.google.inject.Inject
  		public W_Gen187(W_Gen188 w_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  