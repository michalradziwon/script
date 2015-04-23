
  package gen;
  public class W_Gen116 {
  		@com.google.inject.Inject
  		public W_Gen116(W_Gen117 w_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  