
  package gen;
  public class K_Gen3 {
  		@com.google.inject.Inject
  		public K_Gen3(K_Gen4 k_gen4){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen4 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  