
  package gen;
  public class Y_Gen68 {
  		@com.google.inject.Inject
  		public Y_Gen68(Y_Gen69 y_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  