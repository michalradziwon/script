
  package gen;
  public class K_Gen74 {
  		@com.google.inject.Inject
  		public K_Gen74(K_Gen75 k_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  