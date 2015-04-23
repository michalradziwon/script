
  package gen;
  public class K_Gen122 {
  		@com.google.inject.Inject
  		public K_Gen122(K_Gen123 k_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  