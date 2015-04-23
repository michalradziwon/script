
  package gen;
  public class K_Gen101 {
  		@com.google.inject.Inject
  		public K_Gen101(K_Gen102 k_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  