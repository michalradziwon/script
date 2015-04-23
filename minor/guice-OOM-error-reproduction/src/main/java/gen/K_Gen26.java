
  package gen;
  public class K_Gen26 {
  		@com.google.inject.Inject
  		public K_Gen26(K_Gen27 k_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  