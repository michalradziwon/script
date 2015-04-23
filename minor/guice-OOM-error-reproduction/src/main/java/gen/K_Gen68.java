
  package gen;
  public class K_Gen68 {
  		@com.google.inject.Inject
  		public K_Gen68(K_Gen69 k_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  