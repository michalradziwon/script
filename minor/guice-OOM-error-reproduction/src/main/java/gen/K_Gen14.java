
  package gen;
  public class K_Gen14 {
  		@com.google.inject.Inject
  		public K_Gen14(K_Gen15 k_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  