
  package gen;
  public class K_Gen104 {
  		@com.google.inject.Inject
  		public K_Gen104(K_Gen105 k_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  