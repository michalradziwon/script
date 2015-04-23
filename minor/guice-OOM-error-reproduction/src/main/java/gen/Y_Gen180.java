
  package gen;
  public class Y_Gen180 {
  		@com.google.inject.Inject
  		public Y_Gen180(Y_Gen181 y_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  