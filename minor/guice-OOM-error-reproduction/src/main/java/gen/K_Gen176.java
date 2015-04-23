
  package gen;
  public class K_Gen176 {
  		@com.google.inject.Inject
  		public K_Gen176(K_Gen177 k_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  