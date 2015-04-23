
  package gen;
  public class O_Gen145 {
  		@com.google.inject.Inject
  		public O_Gen145(O_Gen146 o_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  