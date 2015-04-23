
  package gen;
  public class K_Gen38 {
  		@com.google.inject.Inject
  		public K_Gen38(K_Gen39 k_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  