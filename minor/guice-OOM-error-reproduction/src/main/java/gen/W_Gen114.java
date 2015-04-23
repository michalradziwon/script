
  package gen;
  public class W_Gen114 {
  		@com.google.inject.Inject
  		public W_Gen114(W_Gen115 w_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  