
  package gen;
  public class K_Gen161 {
  		@com.google.inject.Inject
  		public K_Gen161(K_Gen162 k_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  