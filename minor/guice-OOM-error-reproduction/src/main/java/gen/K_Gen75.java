
  package gen;
  public class K_Gen75 {
  		@com.google.inject.Inject
  		public K_Gen75(K_Gen76 k_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  