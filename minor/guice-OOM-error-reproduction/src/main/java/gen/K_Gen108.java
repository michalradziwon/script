
  package gen;
  public class K_Gen108 {
  		@com.google.inject.Inject
  		public K_Gen108(K_Gen109 k_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  