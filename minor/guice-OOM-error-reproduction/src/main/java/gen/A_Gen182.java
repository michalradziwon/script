
  package gen;
  public class A_Gen182 {
  		@com.google.inject.Inject
  		public A_Gen182(A_Gen183 a_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  