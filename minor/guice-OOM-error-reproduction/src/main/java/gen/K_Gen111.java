
  package gen;
  public class K_Gen111 {
  		@com.google.inject.Inject
  		public K_Gen111(K_Gen112 k_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  