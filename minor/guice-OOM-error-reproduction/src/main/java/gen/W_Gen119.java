
  package gen;
  public class W_Gen119 {
  		@com.google.inject.Inject
  		public W_Gen119(W_Gen120 w_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  