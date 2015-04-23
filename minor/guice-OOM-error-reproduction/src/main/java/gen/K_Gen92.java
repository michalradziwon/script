
  package gen;
  public class K_Gen92 {
  		@com.google.inject.Inject
  		public K_Gen92(K_Gen93 k_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  