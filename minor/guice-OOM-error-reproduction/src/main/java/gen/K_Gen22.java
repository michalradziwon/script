
  package gen;
  public class K_Gen22 {
  		@com.google.inject.Inject
  		public K_Gen22(K_Gen23 k_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  