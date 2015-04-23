
  package gen;
  public class H_Gen27 {
  		@com.google.inject.Inject
  		public H_Gen27(H_Gen28 h_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  