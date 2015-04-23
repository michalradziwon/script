
  package gen;
  public class K_Gen35 {
  		@com.google.inject.Inject
  		public K_Gen35(K_Gen36 k_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  