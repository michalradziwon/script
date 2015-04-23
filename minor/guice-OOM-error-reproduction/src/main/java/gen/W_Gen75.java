
  package gen;
  public class W_Gen75 {
  		@com.google.inject.Inject
  		public W_Gen75(W_Gen76 w_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  