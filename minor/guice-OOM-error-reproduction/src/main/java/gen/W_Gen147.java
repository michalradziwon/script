
  package gen;
  public class W_Gen147 {
  		@com.google.inject.Inject
  		public W_Gen147(W_Gen148 w_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  