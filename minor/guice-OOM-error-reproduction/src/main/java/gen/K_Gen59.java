
  package gen;
  public class K_Gen59 {
  		@com.google.inject.Inject
  		public K_Gen59(K_Gen60 k_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + k_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  