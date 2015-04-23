
  package gen;
  public class K_Gen118 {
  		@com.google.inject.Inject
  		public K_Gen118(K_Gen119 k_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  