
  package gen;
  public class K_Gen76 {
  		@com.google.inject.Inject
  		public K_Gen76(K_Gen77 k_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  