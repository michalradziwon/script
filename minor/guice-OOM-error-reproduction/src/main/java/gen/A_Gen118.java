
  package gen;
  public class A_Gen118 {
  		@com.google.inject.Inject
  		public A_Gen118(A_Gen119 a_gen119){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen119 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  