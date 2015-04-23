
  package gen;
  public class K_Gen167 {
  		@com.google.inject.Inject
  		public K_Gen167(K_Gen168 k_gen168){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen168 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  