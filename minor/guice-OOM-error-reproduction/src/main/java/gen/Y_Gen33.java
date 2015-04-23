
  package gen;
  public class Y_Gen33 {
  		@com.google.inject.Inject
  		public Y_Gen33(Y_Gen34 y_gen34){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen34 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  