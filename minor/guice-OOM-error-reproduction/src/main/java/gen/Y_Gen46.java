
  package gen;
  public class Y_Gen46 {
  		@com.google.inject.Inject
  		public Y_Gen46(Y_Gen47 y_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  