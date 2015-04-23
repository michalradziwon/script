
  package gen;
  public class K_Gen133 {
  		@com.google.inject.Inject
  		public K_Gen133(K_Gen134 k_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  