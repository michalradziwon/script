
  package gen;
  public class A_Gen141 {
  		@com.google.inject.Inject
  		public A_Gen141(A_Gen142 a_gen142){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen142 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  