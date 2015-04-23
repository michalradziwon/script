
  package gen;
  public class K_Gen109 {
  		@com.google.inject.Inject
  		public K_Gen109(K_Gen110 k_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  