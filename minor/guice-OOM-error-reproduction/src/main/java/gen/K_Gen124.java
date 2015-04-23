
  package gen;
  public class K_Gen124 {
  		@com.google.inject.Inject
  		public K_Gen124(K_Gen125 k_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  