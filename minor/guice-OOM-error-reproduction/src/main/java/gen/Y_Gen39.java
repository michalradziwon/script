
  package gen;
  public class Y_Gen39 {
  		@com.google.inject.Inject
  		public Y_Gen39(Y_Gen40 y_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  