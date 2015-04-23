
  package gen;
  public class K_Gen144 {
  		@com.google.inject.Inject
  		public K_Gen144(K_Gen145 k_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  