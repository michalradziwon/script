
  package gen;
  public class W_Gen140 {
  		@com.google.inject.Inject
  		public W_Gen140(W_Gen141 w_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  