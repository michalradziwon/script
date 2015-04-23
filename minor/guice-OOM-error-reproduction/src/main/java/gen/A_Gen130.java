
  package gen;
  public class A_Gen130 {
  		@com.google.inject.Inject
  		public A_Gen130(A_Gen131 a_gen131){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen131 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  