
  package gen;
  public class K_Gen113 {
  		@com.google.inject.Inject
  		public K_Gen113(K_Gen114 k_gen114){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen114 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  