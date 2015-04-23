
  package gen;
  public class A_Gen27 {
  		@com.google.inject.Inject
  		public A_Gen27(A_Gen28 a_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  