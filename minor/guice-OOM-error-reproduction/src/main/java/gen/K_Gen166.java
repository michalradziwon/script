
  package gen;
  public class K_Gen166 {
  		@com.google.inject.Inject
  		public K_Gen166(K_Gen167 k_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  