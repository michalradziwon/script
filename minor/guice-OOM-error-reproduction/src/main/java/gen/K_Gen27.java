
  package gen;
  public class K_Gen27 {
  		@com.google.inject.Inject
  		public K_Gen27(K_Gen28 k_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  