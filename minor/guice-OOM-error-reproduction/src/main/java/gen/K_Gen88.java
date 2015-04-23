
  package gen;
  public class K_Gen88 {
  		@com.google.inject.Inject
  		public K_Gen88(K_Gen89 k_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  