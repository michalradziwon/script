
  package gen;
  public class Y_Gen25 {
  		@com.google.inject.Inject
  		public Y_Gen25(Y_Gen26 y_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  