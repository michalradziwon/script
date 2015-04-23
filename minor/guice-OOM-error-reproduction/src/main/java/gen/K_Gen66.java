
  package gen;
  public class K_Gen66 {
  		@com.google.inject.Inject
  		public K_Gen66(K_Gen67 k_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  