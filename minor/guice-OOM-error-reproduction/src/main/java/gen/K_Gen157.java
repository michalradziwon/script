
  package gen;
  public class K_Gen157 {
  		@com.google.inject.Inject
  		public K_Gen157(K_Gen158 k_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  