
  package gen;
  public class Y_Gen24 {
  		@com.google.inject.Inject
  		public Y_Gen24(Y_Gen25 y_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  