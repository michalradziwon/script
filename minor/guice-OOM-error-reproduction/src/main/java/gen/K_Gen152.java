
  package gen;
  public class K_Gen152 {
  		@com.google.inject.Inject
  		public K_Gen152(K_Gen153 k_gen153){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen153 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  