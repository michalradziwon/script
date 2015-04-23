
  package gen;
  public class W_Gen74 {
  		@com.google.inject.Inject
  		public W_Gen74(W_Gen75 w_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  