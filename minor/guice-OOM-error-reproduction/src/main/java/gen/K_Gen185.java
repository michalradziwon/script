
  package gen;
  public class K_Gen185 {
  		@com.google.inject.Inject
  		public K_Gen185(K_Gen186 k_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  