
  package gen;
  public class K_Gen194 {
  		@com.google.inject.Inject
  		public K_Gen194(K_Gen195 k_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  