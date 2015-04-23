
  package gen;
  public class K_Gen172 {
  		@com.google.inject.Inject
  		public K_Gen172(K_Gen173 k_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  