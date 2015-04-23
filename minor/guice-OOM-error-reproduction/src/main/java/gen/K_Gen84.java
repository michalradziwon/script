
  package gen;
  public class K_Gen84 {
  		@com.google.inject.Inject
  		public K_Gen84(K_Gen85 k_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  