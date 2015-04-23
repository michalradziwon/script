
  package gen;
  public class A_Gen76 {
  		@com.google.inject.Inject
  		public A_Gen76(A_Gen77 a_gen77){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen77 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  