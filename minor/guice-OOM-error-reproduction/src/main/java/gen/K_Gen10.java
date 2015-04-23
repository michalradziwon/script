
  package gen;
  public class K_Gen10 {
  		@com.google.inject.Inject
  		public K_Gen10(K_Gen11 k_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  