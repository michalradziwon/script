
  package gen;
  public class Y_Gen135 {
  		@com.google.inject.Inject
  		public Y_Gen135(Y_Gen136 y_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  