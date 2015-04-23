
  package gen;
  public class K_Gen110 {
  		@com.google.inject.Inject
  		public K_Gen110(K_Gen111 k_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  