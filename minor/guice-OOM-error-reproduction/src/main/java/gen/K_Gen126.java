
  package gen;
  public class K_Gen126 {
  		@com.google.inject.Inject
  		public K_Gen126(K_Gen127 k_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  