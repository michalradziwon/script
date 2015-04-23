
  package gen;
  public class A_Gen75 {
  		@com.google.inject.Inject
  		public A_Gen75(A_Gen76 a_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  