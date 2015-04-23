
  package gen;
  public class K_Gen83 {
  		@com.google.inject.Inject
  		public K_Gen83(K_Gen84 k_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  