
  package gen;
  public class A_Gen25 {
  		@com.google.inject.Inject
  		public A_Gen25(A_Gen26 a_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  