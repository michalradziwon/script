
  package gen;
  public class Y_Gen140 {
  		@com.google.inject.Inject
  		public Y_Gen140(Y_Gen141 y_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  