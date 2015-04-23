
  package gen;
  public class K_Gen71 {
  		@com.google.inject.Inject
  		public K_Gen71(K_Gen72 k_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  