
  package gen;
  public class K_Gen33 {
  		@com.google.inject.Inject
  		public K_Gen33(K_Gen34 k_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  