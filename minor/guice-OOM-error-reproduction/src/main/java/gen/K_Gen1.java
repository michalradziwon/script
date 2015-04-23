
  package gen;
  public class K_Gen1 {
  		@com.google.inject.Inject
  		public K_Gen1(K_Gen2 k_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  