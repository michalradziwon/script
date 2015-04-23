
  package gen;
  public class K_Gen78 {
  		@com.google.inject.Inject
  		public K_Gen78(K_Gen79 k_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  