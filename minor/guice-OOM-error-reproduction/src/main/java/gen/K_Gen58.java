
  package gen;
  public class K_Gen58 {
  		@com.google.inject.Inject
  		public K_Gen58(K_Gen59 k_gen59){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen59 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  