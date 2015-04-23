
  package gen;
  public class A_Gen125 {
  		@com.google.inject.Inject
  		public A_Gen125(A_Gen126 a_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  