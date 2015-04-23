
  package gen;
  public class A_Gen187 {
  		@com.google.inject.Inject
  		public A_Gen187(A_Gen188 a_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  