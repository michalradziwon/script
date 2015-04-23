
  package gen;
  public class A_Gen128 {
  		@com.google.inject.Inject
  		public A_Gen128(A_Gen129 a_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  