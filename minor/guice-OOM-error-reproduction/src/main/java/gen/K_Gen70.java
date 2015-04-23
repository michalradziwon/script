
  package gen;
  public class K_Gen70 {
  		@com.google.inject.Inject
  		public K_Gen70(K_Gen71 k_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  