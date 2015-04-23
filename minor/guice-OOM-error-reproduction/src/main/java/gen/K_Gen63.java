
  package gen;
  public class K_Gen63 {
  		@com.google.inject.Inject
  		public K_Gen63(K_Gen64 k_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  