
  package gen;
  public class Y_Gen27 {
  		@com.google.inject.Inject
  		public Y_Gen27(Y_Gen28 y_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  