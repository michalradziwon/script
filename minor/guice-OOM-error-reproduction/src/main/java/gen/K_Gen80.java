
  package gen;
  public class K_Gen80 {
  		@com.google.inject.Inject
  		public K_Gen80(K_Gen81 k_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  