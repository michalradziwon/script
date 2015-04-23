
  package gen;
  public class A_Gen10 {
  		@com.google.inject.Inject
  		public A_Gen10(A_Gen11 a_gen11){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen11 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  