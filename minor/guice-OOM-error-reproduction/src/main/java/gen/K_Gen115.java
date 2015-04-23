
  package gen;
  public class K_Gen115 {
  		@com.google.inject.Inject
  		public K_Gen115(K_Gen116 k_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  