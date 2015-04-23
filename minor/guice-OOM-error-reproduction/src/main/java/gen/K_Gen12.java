
  package gen;
  public class K_Gen12 {
  		@com.google.inject.Inject
  		public K_Gen12(K_Gen13 k_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  