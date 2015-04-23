
  package gen;
  public class K_Gen183 {
  		@com.google.inject.Inject
  		public K_Gen183(K_Gen184 k_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  