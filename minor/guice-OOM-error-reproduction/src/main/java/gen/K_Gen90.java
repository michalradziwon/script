
  package gen;
  public class K_Gen90 {
  		@com.google.inject.Inject
  		public K_Gen90(K_Gen91 k_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  