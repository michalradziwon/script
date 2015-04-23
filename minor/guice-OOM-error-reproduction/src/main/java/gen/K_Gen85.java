
  package gen;
  public class K_Gen85 {
  		@com.google.inject.Inject
  		public K_Gen85(K_Gen86 k_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  