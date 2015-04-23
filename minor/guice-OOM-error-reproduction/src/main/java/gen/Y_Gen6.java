
  package gen;
  public class Y_Gen6 {
  		@com.google.inject.Inject
  		public Y_Gen6(Y_Gen7 y_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  