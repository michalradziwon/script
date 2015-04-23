
  package gen;
  public class K_Gen57 {
  		@com.google.inject.Inject
  		public K_Gen57(K_Gen58 k_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  