
  package gen;
  public class A_Gen9 {
  		@com.google.inject.Inject
  		public A_Gen9(A_Gen10 a_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  