
  package gen;
  public class K_Gen16 {
  		@com.google.inject.Inject
  		public K_Gen16(K_Gen17 k_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  