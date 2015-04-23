
  package gen;
  public class K_Gen147 {
  		@com.google.inject.Inject
  		public K_Gen147(K_Gen148 k_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  