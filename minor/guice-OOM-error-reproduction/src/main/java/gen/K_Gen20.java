
  package gen;
  public class K_Gen20 {
  		@com.google.inject.Inject
  		public K_Gen20(K_Gen21 k_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  