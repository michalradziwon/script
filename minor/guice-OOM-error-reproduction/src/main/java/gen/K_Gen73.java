
  package gen;
  public class K_Gen73 {
  		@com.google.inject.Inject
  		public K_Gen73(K_Gen74 k_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  