
  package gen;
  public class K_Gen188 {
  		@com.google.inject.Inject
  		public K_Gen188(K_Gen189 k_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  