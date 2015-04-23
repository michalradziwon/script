
  package gen;
  public class X_Gen110 {
  		@com.google.inject.Inject
  		public X_Gen110(X_Gen111 x_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + x_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  