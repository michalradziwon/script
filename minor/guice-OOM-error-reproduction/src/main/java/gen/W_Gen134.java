
  package gen;
  public class W_Gen134 {
  		@com.google.inject.Inject
  		public W_Gen134(W_Gen135 w_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  