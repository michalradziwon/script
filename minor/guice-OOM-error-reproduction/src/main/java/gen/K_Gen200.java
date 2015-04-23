
  package gen;
  public class K_Gen200 {
  		@com.google.inject.Inject
  		public K_Gen200(){
  			System.out.println(this.getClass().getCanonicalName() + " created. "  );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  