
  package gen;
  public class K_Gen17 {
  		@com.google.inject.Inject
  		public K_Gen17(K_Gen18 k_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  