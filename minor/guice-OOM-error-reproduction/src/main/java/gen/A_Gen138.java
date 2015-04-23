
  package gen;
  public class A_Gen138 {
  		@com.google.inject.Inject
  		public A_Gen138(A_Gen139 a_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  