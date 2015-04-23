
  package gen;
  public class E_Gen200 {
  		@com.google.inject.Inject
  		public E_Gen200(){
  			System.out.println(this.getClass().getCanonicalName() + " created. "  );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  