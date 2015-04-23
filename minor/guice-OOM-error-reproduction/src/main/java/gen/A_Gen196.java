
  package gen;
  public class A_Gen196 {
  		@com.google.inject.Inject
  		public A_Gen196(A_Gen197 a_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  