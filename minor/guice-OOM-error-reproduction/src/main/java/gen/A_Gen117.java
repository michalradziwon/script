
  package gen;
  public class A_Gen117 {
  		@com.google.inject.Inject
  		public A_Gen117(A_Gen118 a_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  