
  package gen;
  public class K_Gen189 {
  		@com.google.inject.Inject
  		public K_Gen189(K_Gen190 k_gen190){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen190 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  