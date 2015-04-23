
  package gen;
  public class K_Gen148 {
  		@com.google.inject.Inject
  		public K_Gen148(K_Gen149 k_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  