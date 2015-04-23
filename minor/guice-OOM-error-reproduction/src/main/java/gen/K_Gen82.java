
  package gen;
  public class K_Gen82 {
  		@com.google.inject.Inject
  		public K_Gen82(K_Gen83 k_gen83){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen83 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  