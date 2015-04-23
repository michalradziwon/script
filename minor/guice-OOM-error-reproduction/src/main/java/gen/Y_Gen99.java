
  package gen;
  public class Y_Gen99 {
  		@com.google.inject.Inject
  		public Y_Gen99(Y_Gen100 y_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  