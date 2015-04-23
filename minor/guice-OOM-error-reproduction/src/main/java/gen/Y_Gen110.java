
  package gen;
  public class Y_Gen110 {
  		@com.google.inject.Inject
  		public Y_Gen110(Y_Gen111 y_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  