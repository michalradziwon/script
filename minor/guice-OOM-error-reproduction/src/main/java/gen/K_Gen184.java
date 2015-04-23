
  package gen;
  public class K_Gen184 {
  		@com.google.inject.Inject
  		public K_Gen184(K_Gen185 k_gen185){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen185 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  