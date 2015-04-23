
  package gen;
  public class W_Gen103 {
  		@com.google.inject.Inject
  		public W_Gen103(W_Gen104 w_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  