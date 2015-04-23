
  package gen;
  public class K_Gen187 {
  		@com.google.inject.Inject
  		public K_Gen187(K_Gen188 k_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  