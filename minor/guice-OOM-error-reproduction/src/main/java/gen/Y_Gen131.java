
  package gen;
  public class Y_Gen131 {
  		@com.google.inject.Inject
  		public Y_Gen131(Y_Gen132 y_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  