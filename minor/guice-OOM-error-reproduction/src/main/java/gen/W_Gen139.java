
  package gen;
  public class W_Gen139 {
  		@com.google.inject.Inject
  		public W_Gen139(W_Gen140 w_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  