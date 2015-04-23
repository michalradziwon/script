
  package gen;
  public class Y_Gen136 {
  		@com.google.inject.Inject
  		public Y_Gen136(Y_Gen137 y_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  