
  package gen;
  public class K_Gen179 {
  		@com.google.inject.Inject
  		public K_Gen179(K_Gen180 k_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  