
  package gen;
  public class K_Gen81 {
  		@com.google.inject.Inject
  		public K_Gen81(K_Gen82 k_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  