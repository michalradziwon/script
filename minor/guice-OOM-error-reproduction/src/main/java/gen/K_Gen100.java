
  package gen;
  public class K_Gen100 {
  		@com.google.inject.Inject
  		public K_Gen100(K_Gen101 k_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  