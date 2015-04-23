
  package gen;
  public class Y_Gen63 {
  		@com.google.inject.Inject
  		public Y_Gen63(Y_Gen64 y_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  