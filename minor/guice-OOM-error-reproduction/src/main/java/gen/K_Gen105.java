
  package gen;
  public class K_Gen105 {
  		@com.google.inject.Inject
  		public K_Gen105(K_Gen106 k_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  