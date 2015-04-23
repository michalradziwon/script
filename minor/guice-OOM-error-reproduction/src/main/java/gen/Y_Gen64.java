
  package gen;
  public class Y_Gen64 {
  		@com.google.inject.Inject
  		public Y_Gen64(Y_Gen65 y_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  