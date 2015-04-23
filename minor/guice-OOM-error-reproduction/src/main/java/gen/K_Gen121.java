
  package gen;
  public class K_Gen121 {
  		@com.google.inject.Inject
  		public K_Gen121(K_Gen122 k_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  