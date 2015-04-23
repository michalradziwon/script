
  package gen;
  public class K_Gen139 {
  		@com.google.inject.Inject
  		public K_Gen139(K_Gen140 k_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  