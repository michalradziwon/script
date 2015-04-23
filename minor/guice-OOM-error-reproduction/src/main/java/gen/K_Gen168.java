
  package gen;
  public class K_Gen168 {
  		@com.google.inject.Inject
  		public K_Gen168(K_Gen169 k_gen169){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen169 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  