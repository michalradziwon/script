
  package gen;
  public class K_Gen72 {
  		@com.google.inject.Inject
  		public K_Gen72(K_Gen73 k_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  