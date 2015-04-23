
  package gen;
  public class K_Gen46 {
  		@com.google.inject.Inject
  		public K_Gen46(K_Gen47 k_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  