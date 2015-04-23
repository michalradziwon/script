
  package gen;
  public class A_Gen108 {
  		@com.google.inject.Inject
  		public A_Gen108(A_Gen109 a_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  