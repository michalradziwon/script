
  package gen;
  public class K_Gen143 {
  		@com.google.inject.Inject
  		public K_Gen143(K_Gen144 k_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  