
  package gen;
  public class K_Gen131 {
  		@com.google.inject.Inject
  		public K_Gen131(K_Gen132 k_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  