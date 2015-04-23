
  package gen;
  public class K_Gen40 {
  		@com.google.inject.Inject
  		public K_Gen40(K_Gen41 k_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  