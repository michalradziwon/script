
  package gen;
  public class A_Gen145 {
  		@com.google.inject.Inject
  		public A_Gen145(A_Gen146 a_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  