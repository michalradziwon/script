
  package gen;
  public class W_Gen142 {
  		@com.google.inject.Inject
  		public W_Gen142(W_Gen143 w_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  