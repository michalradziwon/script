
  package gen;
  public class A_Gen190 {
  		@com.google.inject.Inject
  		public A_Gen190(A_Gen191 a_gen191){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen191 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  