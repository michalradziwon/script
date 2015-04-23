
  package gen;
  public class K_Gen130 {
  		@com.google.inject.Inject
  		public K_Gen130(K_Gen131 k_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  