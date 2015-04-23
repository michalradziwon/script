
  package gen;
  public class Y_Gen108 {
  		@com.google.inject.Inject
  		public Y_Gen108(Y_Gen109 y_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  