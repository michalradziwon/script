
  package gen;
  public class K_Gen47 {
  		@com.google.inject.Inject
  		public K_Gen47(K_Gen48 k_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  