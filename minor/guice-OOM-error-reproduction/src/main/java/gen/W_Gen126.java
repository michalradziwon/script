
  package gen;
  public class W_Gen126 {
  		@com.google.inject.Inject
  		public W_Gen126(W_Gen127 w_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  