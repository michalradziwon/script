
  package gen;
  public class K_Gen79 {
  		@com.google.inject.Inject
  		public K_Gen79(K_Gen80 k_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  