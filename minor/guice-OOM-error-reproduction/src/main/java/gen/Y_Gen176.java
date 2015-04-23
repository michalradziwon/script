
  package gen;
  public class Y_Gen176 {
  		@com.google.inject.Inject
  		public Y_Gen176(Y_Gen177 y_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  