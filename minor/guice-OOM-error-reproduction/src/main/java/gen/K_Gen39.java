
  package gen;
  public class K_Gen39 {
  		@com.google.inject.Inject
  		public K_Gen39(K_Gen40 k_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  