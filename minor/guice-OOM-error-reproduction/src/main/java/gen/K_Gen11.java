
  package gen;
  public class K_Gen11 {
  		@com.google.inject.Inject
  		public K_Gen11(K_Gen12 k_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  