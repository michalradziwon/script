
  package gen;
  public class K_Gen112 {
  		@com.google.inject.Inject
  		public K_Gen112(K_Gen113 k_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  