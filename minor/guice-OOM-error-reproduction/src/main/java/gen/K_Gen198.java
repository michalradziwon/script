
  package gen;
  public class K_Gen198 {
  		@com.google.inject.Inject
  		public K_Gen198(K_Gen199 k_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  