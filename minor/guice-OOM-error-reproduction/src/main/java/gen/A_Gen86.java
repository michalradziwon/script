
  package gen;
  public class A_Gen86 {
  		@com.google.inject.Inject
  		public A_Gen86(A_Gen87 a_gen87){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen87 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  