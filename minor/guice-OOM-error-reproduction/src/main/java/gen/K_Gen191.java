
  package gen;
  public class K_Gen191 {
  		@com.google.inject.Inject
  		public K_Gen191(K_Gen192 k_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  