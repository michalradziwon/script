
  package gen;
  public class K_Gen89 {
  		@com.google.inject.Inject
  		public K_Gen89(K_Gen90 k_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  