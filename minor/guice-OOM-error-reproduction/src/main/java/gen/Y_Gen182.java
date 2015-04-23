
  package gen;
  public class Y_Gen182 {
  		@com.google.inject.Inject
  		public Y_Gen182(Y_Gen183 y_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  