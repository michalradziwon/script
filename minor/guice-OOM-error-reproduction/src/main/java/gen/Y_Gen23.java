
  package gen;
  public class Y_Gen23 {
  		@com.google.inject.Inject
  		public Y_Gen23(Y_Gen24 y_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  