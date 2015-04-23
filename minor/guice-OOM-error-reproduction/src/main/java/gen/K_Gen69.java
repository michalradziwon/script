
  package gen;
  public class K_Gen69 {
  		@com.google.inject.Inject
  		public K_Gen69(K_Gen70 k_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  