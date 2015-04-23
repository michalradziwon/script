
  package gen;
  public class Y_Gen78 {
  		@com.google.inject.Inject
  		public Y_Gen78(Y_Gen79 y_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  