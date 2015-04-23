
  package gen;
  public class A_Gen106 {
  		@com.google.inject.Inject
  		public A_Gen106(A_Gen107 a_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  