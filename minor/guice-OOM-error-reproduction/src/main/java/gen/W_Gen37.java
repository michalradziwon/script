
  package gen;
  public class W_Gen37 {
  		@com.google.inject.Inject
  		public W_Gen37(W_Gen38 w_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  