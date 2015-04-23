
  package gen;
  public class K_Gen50 {
  		@com.google.inject.Inject
  		public K_Gen50(K_Gen51 k_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  