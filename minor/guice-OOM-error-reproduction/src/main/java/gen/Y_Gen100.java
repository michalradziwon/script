
  package gen;
  public class Y_Gen100 {
  		@com.google.inject.Inject
  		public Y_Gen100(Y_Gen101 y_gen101){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen101 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  