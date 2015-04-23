
  package gen;
  public class K_Gen86 {
  		@com.google.inject.Inject
  		public K_Gen86(K_Gen87 k_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  