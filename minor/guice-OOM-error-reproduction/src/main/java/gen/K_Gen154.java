
  package gen;
  public class K_Gen154 {
  		@com.google.inject.Inject
  		public K_Gen154(K_Gen155 k_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  