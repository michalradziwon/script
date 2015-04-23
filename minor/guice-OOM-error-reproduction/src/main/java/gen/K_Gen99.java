
  package gen;
  public class K_Gen99 {
  		@com.google.inject.Inject
  		public K_Gen99(K_Gen100 k_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  