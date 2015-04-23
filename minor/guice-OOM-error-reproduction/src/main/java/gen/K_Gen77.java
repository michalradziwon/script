
  package gen;
  public class K_Gen77 {
  		@com.google.inject.Inject
  		public K_Gen77(K_Gen78 k_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  