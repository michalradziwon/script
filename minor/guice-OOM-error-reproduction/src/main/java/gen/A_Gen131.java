
  package gen;
  public class A_Gen131 {
  		@com.google.inject.Inject
  		public A_Gen131(A_Gen132 a_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  