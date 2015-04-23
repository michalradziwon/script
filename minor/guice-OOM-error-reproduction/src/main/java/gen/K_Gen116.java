
  package gen;
  public class K_Gen116 {
  		@com.google.inject.Inject
  		public K_Gen116(K_Gen117 k_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  