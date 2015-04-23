
  package gen;
  public class A_Gen74 {
  		@com.google.inject.Inject
  		public A_Gen74(A_Gen75 a_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  