
  package gen;
  public class K_Gen196 {
  		@com.google.inject.Inject
  		public K_Gen196(K_Gen197 k_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  