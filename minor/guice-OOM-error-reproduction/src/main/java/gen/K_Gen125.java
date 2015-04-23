
  package gen;
  public class K_Gen125 {
  		@com.google.inject.Inject
  		public K_Gen125(K_Gen126 k_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  