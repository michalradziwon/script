
  package gen;
  public class W_Gen190 {
  		@com.google.inject.Inject
  		public W_Gen190(W_Gen191 w_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  