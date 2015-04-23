
  package gen;
  public class W_Gen146 {
  		@com.google.inject.Inject
  		public W_Gen146(W_Gen147 w_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  