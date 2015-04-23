
  package gen;
  public class K_Gen160 {
  		@com.google.inject.Inject
  		public K_Gen160(K_Gen161 k_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  