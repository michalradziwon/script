
  package gen;
  public class K_Gen138 {
  		@com.google.inject.Inject
  		public K_Gen138(K_Gen139 k_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  