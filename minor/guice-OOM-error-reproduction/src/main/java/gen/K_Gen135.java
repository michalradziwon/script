
  package gen;
  public class K_Gen135 {
  		@com.google.inject.Inject
  		public K_Gen135(K_Gen136 k_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  