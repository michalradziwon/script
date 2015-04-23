
  package gen;
  public class K_Gen114 {
  		@com.google.inject.Inject
  		public K_Gen114(K_Gen115 k_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  