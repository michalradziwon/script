
  package gen;
  public class Y_Gen149 {
  		@com.google.inject.Inject
  		public Y_Gen149(Y_Gen150 y_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  