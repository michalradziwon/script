
  package gen;
  public class A_Gen176 {
  		@com.google.inject.Inject
  		public A_Gen176(A_Gen177 a_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  