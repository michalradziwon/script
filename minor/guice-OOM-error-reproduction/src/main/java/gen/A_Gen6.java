
  package gen;
  public class A_Gen6 {
  		@com.google.inject.Inject
  		public A_Gen6(A_Gen7 a_gen7){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen7 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  