
  package gen;
  public class K_Gen128 {
  		@com.google.inject.Inject
  		public K_Gen128(K_Gen129 k_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  