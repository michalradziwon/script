
  package gen;
  public class K_Gen140 {
  		@com.google.inject.Inject
  		public K_Gen140(K_Gen141 k_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  