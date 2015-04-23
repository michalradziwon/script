
  package gen;
  public class K_Gen7 {
  		@com.google.inject.Inject
  		public K_Gen7(K_Gen8 k_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  