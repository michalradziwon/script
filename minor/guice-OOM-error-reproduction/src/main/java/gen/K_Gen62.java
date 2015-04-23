
  package gen;
  public class K_Gen62 {
  		@com.google.inject.Inject
  		public K_Gen62(K_Gen63 k_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  