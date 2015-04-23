
  package gen;
  public class K_Gen52 {
  		@com.google.inject.Inject
  		public K_Gen52(K_Gen53 k_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  