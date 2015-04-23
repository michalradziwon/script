
  package gen;
  public class K_Gen43 {
  		@com.google.inject.Inject
  		public K_Gen43(K_Gen44 k_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  