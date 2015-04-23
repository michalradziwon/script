
  package gen;
  public class K_Gen65 {
  		@com.google.inject.Inject
  		public K_Gen65(K_Gen66 k_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  