
  package gen;
  public class K_Gen146 {
  		@com.google.inject.Inject
  		public K_Gen146(K_Gen147 k_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  