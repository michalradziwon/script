
  package gen;
  public class A_Gen120 {
  		@com.google.inject.Inject
  		public A_Gen120(A_Gen121 a_gen121){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen121 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  