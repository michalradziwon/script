
  package gen;
  public class K_Gen129 {
  		@com.google.inject.Inject
  		public K_Gen129(K_Gen130 k_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  