
  package gen;
  public class A_Gen109 {
  		@com.google.inject.Inject
  		public A_Gen109(A_Gen110 a_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  