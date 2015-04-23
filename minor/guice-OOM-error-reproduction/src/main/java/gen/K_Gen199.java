
  package gen;
  public class K_Gen199 {
  		@com.google.inject.Inject
  		public K_Gen199(K_Gen200 k_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  