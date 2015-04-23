
  package gen;
  public class Y_Gen5 {
  		@com.google.inject.Inject
  		public Y_Gen5(Y_Gen6 y_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  