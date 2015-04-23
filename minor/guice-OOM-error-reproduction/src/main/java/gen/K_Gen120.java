
  package gen;
  public class K_Gen120 {
  		@com.google.inject.Inject
  		public K_Gen120(K_Gen121 k_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  