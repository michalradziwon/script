
  package gen;
  public class Y_Gen75 {
  		@com.google.inject.Inject
  		public Y_Gen75(Y_Gen76 y_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  