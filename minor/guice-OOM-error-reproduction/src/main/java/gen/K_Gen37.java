
  package gen;
  public class K_Gen37 {
  		@com.google.inject.Inject
  		public K_Gen37(K_Gen38 k_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  