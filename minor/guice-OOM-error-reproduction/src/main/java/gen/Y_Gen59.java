
  package gen;
  public class Y_Gen59 {
  		@com.google.inject.Inject
  		public Y_Gen59(Y_Gen60 y_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  