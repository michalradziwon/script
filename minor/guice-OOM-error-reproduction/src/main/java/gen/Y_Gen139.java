
  package gen;
  public class Y_Gen139 {
  		@com.google.inject.Inject
  		public Y_Gen139(Y_Gen140 y_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  