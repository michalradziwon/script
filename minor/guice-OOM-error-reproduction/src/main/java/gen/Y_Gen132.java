
  package gen;
  public class Y_Gen132 {
  		@com.google.inject.Inject
  		public Y_Gen132(Y_Gen133 y_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  