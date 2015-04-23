
  package gen;
  public class K_Gen107 {
  		@com.google.inject.Inject
  		public K_Gen107(K_Gen108 k_gen108){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen108 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  