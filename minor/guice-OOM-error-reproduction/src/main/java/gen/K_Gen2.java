
  package gen;
  public class K_Gen2 {
  		@com.google.inject.Inject
  		public K_Gen2(K_Gen3 k_gen3){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen3 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  