
  package gen;
  public class A_Gen110 {
  		@com.google.inject.Inject
  		public A_Gen110(A_Gen111 a_gen111){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen111 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  