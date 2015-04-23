
  package gen;
  public class K_Gen182 {
  		@com.google.inject.Inject
  		public K_Gen182(K_Gen183 k_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  