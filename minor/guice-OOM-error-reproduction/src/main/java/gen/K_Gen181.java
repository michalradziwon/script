
  package gen;
  public class K_Gen181 {
  		@com.google.inject.Inject
  		public K_Gen181(K_Gen182 k_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  