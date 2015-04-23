
  package gen;
  public class A_Gen77 {
  		@com.google.inject.Inject
  		public A_Gen77(A_Gen78 a_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  