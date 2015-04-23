
  package gen;
  public class K_Gen28 {
  		@com.google.inject.Inject
  		public K_Gen28(K_Gen29 k_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  