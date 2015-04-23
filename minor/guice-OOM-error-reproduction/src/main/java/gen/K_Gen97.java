
  package gen;
  public class K_Gen97 {
  		@com.google.inject.Inject
  		public K_Gen97(K_Gen98 k_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  