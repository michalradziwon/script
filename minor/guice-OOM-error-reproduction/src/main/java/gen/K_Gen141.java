
  package gen;
  public class K_Gen141 {
  		@com.google.inject.Inject
  		public K_Gen141(K_Gen142 k_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  