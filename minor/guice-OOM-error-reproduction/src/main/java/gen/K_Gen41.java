
  package gen;
  public class K_Gen41 {
  		@com.google.inject.Inject
  		public K_Gen41(K_Gen42 k_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  