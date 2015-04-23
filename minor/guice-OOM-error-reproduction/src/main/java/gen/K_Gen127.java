
  package gen;
  public class K_Gen127 {
  		@com.google.inject.Inject
  		public K_Gen127(K_Gen128 k_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  