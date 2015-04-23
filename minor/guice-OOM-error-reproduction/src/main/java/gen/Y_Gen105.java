
  package gen;
  public class Y_Gen105 {
  		@com.google.inject.Inject
  		public Y_Gen105(Y_Gen106 y_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  