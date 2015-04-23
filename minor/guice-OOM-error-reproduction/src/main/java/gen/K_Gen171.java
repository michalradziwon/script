
  package gen;
  public class K_Gen171 {
  		@com.google.inject.Inject
  		public K_Gen171(K_Gen172 k_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  