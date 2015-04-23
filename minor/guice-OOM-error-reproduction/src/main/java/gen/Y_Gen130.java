
  package gen;
  public class Y_Gen130 {
  		@com.google.inject.Inject
  		public Y_Gen130(Y_Gen131 y_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  