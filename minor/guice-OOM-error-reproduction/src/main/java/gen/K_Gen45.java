
  package gen;
  public class K_Gen45 {
  		@com.google.inject.Inject
  		public K_Gen45(K_Gen46 k_gen46){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen46 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  