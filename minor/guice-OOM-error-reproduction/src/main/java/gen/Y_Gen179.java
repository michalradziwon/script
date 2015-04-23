
  package gen;
  public class Y_Gen179 {
  		@com.google.inject.Inject
  		public Y_Gen179(Y_Gen180 y_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  