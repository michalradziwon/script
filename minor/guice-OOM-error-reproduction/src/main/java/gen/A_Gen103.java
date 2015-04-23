
  package gen;
  public class A_Gen103 {
  		@com.google.inject.Inject
  		public A_Gen103(A_Gen104 a_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  