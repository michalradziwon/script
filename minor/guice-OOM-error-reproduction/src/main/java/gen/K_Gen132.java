
  package gen;
  public class K_Gen132 {
  		@com.google.inject.Inject
  		public K_Gen132(K_Gen133 k_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  