
  package gen;
  public class B_Gen200 {
  		@com.google.inject.Inject
  		public B_Gen200(){
  			System.out.println(this.getClass().getCanonicalName() + " created. "  );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  