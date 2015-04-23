
  package gen;
  public class K_Gen36 {
  		@com.google.inject.Inject
  		public K_Gen36(K_Gen37 k_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  