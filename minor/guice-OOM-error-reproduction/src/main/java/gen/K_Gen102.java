
  package gen;
  public class K_Gen102 {
  		@com.google.inject.Inject
  		public K_Gen102(K_Gen103 k_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  