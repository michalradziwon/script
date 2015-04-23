
  package gen;
  public class K_Gen155 {
  		@com.google.inject.Inject
  		public K_Gen155(K_Gen156 k_gen156){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen156 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  