
  package gen;
  public class Y_Gen120 {
  		@com.google.inject.Inject
  		public Y_Gen120(Y_Gen121 y_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  