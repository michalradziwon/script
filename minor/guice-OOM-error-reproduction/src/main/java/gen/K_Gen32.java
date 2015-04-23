
  package gen;
  public class K_Gen32 {
  		@com.google.inject.Inject
  		public K_Gen32(K_Gen33 k_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  