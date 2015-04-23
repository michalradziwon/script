
  package gen;
  public class Y_Gen145 {
  		@com.google.inject.Inject
  		public Y_Gen145(Y_Gen146 y_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  