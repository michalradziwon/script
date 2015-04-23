
  package gen;
  public class W_Gen196 {
  		@com.google.inject.Inject
  		public W_Gen196(W_Gen197 w_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  