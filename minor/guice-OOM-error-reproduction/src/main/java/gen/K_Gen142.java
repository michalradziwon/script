
  package gen;
  public class K_Gen142 {
  		@com.google.inject.Inject
  		public K_Gen142(K_Gen143 k_gen143){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen143 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  