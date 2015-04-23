
  package gen;
  public class A_Gen119 {
  		@com.google.inject.Inject
  		public A_Gen119(A_Gen120 a_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  