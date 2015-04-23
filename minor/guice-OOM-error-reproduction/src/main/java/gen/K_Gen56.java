
  package gen;
  public class K_Gen56 {
  		@com.google.inject.Inject
  		public K_Gen56(K_Gen57 k_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  