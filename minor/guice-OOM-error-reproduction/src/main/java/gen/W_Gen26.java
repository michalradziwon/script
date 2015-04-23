
  package gen;
  public class W_Gen26 {
  		@com.google.inject.Inject
  		public W_Gen26(W_Gen27 w_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  