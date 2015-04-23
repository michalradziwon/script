
  package gen;
  public class W_Gen110 {
  		@com.google.inject.Inject
  		public W_Gen110(W_Gen111 w_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  