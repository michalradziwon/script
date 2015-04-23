
  package gen;
  public class W_Gen65 {
  		@com.google.inject.Inject
  		public W_Gen65(W_Gen66 w_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  