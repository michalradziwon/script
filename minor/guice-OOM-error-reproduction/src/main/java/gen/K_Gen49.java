
  package gen;
  public class K_Gen49 {
  		@com.google.inject.Inject
  		public K_Gen49(K_Gen50 k_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  