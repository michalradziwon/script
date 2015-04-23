
  package gen;
  public class K_Gen8 {
  		@com.google.inject.Inject
  		public K_Gen8(K_Gen9 k_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  