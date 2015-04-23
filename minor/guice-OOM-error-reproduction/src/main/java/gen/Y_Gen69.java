
  package gen;
  public class Y_Gen69 {
  		@com.google.inject.Inject
  		public Y_Gen69(Y_Gen70 y_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  