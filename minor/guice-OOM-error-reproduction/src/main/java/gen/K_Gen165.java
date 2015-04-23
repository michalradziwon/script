
  package gen;
  public class K_Gen165 {
  		@com.google.inject.Inject
  		public K_Gen165(K_Gen166 k_gen166){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen166 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  