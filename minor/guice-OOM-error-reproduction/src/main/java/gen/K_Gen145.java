
  package gen;
  public class K_Gen145 {
  		@com.google.inject.Inject
  		public K_Gen145(K_Gen146 k_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  