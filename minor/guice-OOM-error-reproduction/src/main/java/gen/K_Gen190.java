
  package gen;
  public class K_Gen190 {
  		@com.google.inject.Inject
  		public K_Gen190(K_Gen191 k_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  