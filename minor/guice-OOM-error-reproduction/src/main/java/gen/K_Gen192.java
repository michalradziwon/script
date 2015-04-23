
  package gen;
  public class K_Gen192 {
  		@com.google.inject.Inject
  		public K_Gen192(K_Gen193 k_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  