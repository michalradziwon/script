
  package gen;
  public class W_Gen195 {
  		@com.google.inject.Inject
  		public W_Gen195(W_Gen196 w_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  