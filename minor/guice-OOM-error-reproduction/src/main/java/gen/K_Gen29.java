
  package gen;
  public class K_Gen29 {
  		@com.google.inject.Inject
  		public K_Gen29(K_Gen30 k_gen30){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen30 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  