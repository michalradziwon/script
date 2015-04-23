
  package gen;
  public class Y_Gen161 {
  		@com.google.inject.Inject
  		public Y_Gen161(Y_Gen162 y_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  