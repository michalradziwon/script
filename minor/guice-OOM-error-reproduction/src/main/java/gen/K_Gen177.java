
  package gen;
  public class K_Gen177 {
  		@com.google.inject.Inject
  		public K_Gen177(K_Gen178 k_gen178){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen178 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  