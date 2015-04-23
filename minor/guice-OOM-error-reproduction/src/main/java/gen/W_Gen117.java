
  package gen;
  public class W_Gen117 {
  		@com.google.inject.Inject
  		public W_Gen117(W_Gen118 w_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  