
  package gen;
  public class K_Gen136 {
  		@com.google.inject.Inject
  		public K_Gen136(K_Gen137 k_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  