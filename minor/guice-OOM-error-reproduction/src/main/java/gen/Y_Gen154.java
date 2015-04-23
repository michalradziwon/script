
  package gen;
  public class Y_Gen154 {
  		@com.google.inject.Inject
  		public Y_Gen154(Y_Gen155 y_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  