
  package gen;
  public class K_Gen42 {
  		@com.google.inject.Inject
  		public K_Gen42(K_Gen43 k_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  