
  package gen;
  public class K_Gen64 {
  		@com.google.inject.Inject
  		public K_Gen64(K_Gen65 k_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  