
  package gen;
  public class Y_Gen191 {
  		@com.google.inject.Inject
  		public Y_Gen191(Y_Gen192 y_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  