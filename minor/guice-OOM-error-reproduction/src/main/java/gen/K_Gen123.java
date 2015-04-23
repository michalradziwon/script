
  package gen;
  public class K_Gen123 {
  		@com.google.inject.Inject
  		public K_Gen123(K_Gen124 k_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  