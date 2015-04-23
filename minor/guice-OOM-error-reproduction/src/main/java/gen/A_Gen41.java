
  package gen;
  public class A_Gen41 {
  		@com.google.inject.Inject
  		public A_Gen41(A_Gen42 a_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  