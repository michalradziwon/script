
  package gen;
  public class K_Gen117 {
  		@com.google.inject.Inject
  		public K_Gen117(K_Gen118 k_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  