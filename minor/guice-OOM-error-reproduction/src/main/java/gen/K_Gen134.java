
  package gen;
  public class K_Gen134 {
  		@com.google.inject.Inject
  		public K_Gen134(K_Gen135 k_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  