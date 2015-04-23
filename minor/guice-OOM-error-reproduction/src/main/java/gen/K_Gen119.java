
  package gen;
  public class K_Gen119 {
  		@com.google.inject.Inject
  		public K_Gen119(K_Gen120 k_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  