
  package gen;
  public class Y_Gen96 {
  		@com.google.inject.Inject
  		public Y_Gen96(Y_Gen97 y_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  