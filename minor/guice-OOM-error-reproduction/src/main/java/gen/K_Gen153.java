
  package gen;
  public class K_Gen153 {
  		@com.google.inject.Inject
  		public K_Gen153(K_Gen154 k_gen154){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen154 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  