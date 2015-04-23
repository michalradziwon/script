
  package gen;
  public class Y_Gen20 {
  		@com.google.inject.Inject
  		public Y_Gen20(Y_Gen21 y_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  