
  package gen;
  public class K_Gen151 {
  		@com.google.inject.Inject
  		public K_Gen151(K_Gen152 k_gen152){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen152 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  