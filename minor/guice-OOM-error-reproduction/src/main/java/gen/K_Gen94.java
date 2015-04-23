
  package gen;
  public class K_Gen94 {
  		@com.google.inject.Inject
  		public K_Gen94(K_Gen95 k_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  