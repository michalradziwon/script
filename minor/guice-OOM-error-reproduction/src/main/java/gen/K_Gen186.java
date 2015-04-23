
  package gen;
  public class K_Gen186 {
  		@com.google.inject.Inject
  		public K_Gen186(K_Gen187 k_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  