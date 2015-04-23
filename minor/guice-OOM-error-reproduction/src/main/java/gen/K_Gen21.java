
  package gen;
  public class K_Gen21 {
  		@com.google.inject.Inject
  		public K_Gen21(K_Gen22 k_gen22){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen22 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  