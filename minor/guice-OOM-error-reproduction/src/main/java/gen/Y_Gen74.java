
  package gen;
  public class Y_Gen74 {
  		@com.google.inject.Inject
  		public Y_Gen74(Y_Gen75 y_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  