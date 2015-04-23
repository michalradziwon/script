
  package gen;
  public class D_Gen200 {
  		@com.google.inject.Inject
  		public D_Gen200(){
  			System.out.println(this.getClass().getCanonicalName() + " created. "  );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  