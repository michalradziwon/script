
  package gen;
  public class Y_Gen109 {
  		@com.google.inject.Inject
  		public Y_Gen109(Y_Gen110 y_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  