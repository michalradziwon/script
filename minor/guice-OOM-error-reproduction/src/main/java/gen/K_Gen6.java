
  package gen;
  public class K_Gen6 {
  		@com.google.inject.Inject
  		public K_Gen6(K_Gen7 k_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  