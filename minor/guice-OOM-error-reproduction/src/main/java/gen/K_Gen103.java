
  package gen;
  public class K_Gen103 {
  		@com.google.inject.Inject
  		public K_Gen103(K_Gen104 k_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  