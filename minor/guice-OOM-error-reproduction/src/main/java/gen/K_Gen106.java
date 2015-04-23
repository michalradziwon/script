
  package gen;
  public class K_Gen106 {
  		@com.google.inject.Inject
  		public K_Gen106(K_Gen107 k_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  