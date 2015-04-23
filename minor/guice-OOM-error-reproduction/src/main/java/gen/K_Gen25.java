
  package gen;
  public class K_Gen25 {
  		@com.google.inject.Inject
  		public K_Gen25(K_Gen26 k_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  