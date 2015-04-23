
  package gen;
  public class K_Gen96 {
  		@com.google.inject.Inject
  		public K_Gen96(K_Gen97 k_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  