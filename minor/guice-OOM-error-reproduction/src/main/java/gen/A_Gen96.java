
  package gen;
  public class A_Gen96 {
  		@com.google.inject.Inject
  		public A_Gen96(A_Gen97 a_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  