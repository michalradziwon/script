
  package gen;
  public class K_Gen149 {
  		@com.google.inject.Inject
  		public K_Gen149(K_Gen150 k_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  