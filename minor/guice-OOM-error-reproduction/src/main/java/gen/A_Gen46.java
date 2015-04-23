
  package gen;
  public class A_Gen46 {
  		@com.google.inject.Inject
  		public A_Gen46(A_Gen47 a_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  