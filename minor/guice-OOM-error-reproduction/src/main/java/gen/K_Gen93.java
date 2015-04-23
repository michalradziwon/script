
  package gen;
  public class K_Gen93 {
  		@com.google.inject.Inject
  		public K_Gen93(K_Gen94 k_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  