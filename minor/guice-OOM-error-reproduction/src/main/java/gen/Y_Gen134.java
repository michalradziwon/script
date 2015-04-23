
  package gen;
  public class Y_Gen134 {
  		@com.google.inject.Inject
  		public Y_Gen134(Y_Gen135 y_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  