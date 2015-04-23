
  package gen;
  public class K_Gen19 {
  		@com.google.inject.Inject
  		public K_Gen19(K_Gen20 k_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  