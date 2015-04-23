
  package gen;
  public class A_Gen78 {
  		@com.google.inject.Inject
  		public A_Gen78(A_Gen79 a_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  