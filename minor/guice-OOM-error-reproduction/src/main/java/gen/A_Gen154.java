
  package gen;
  public class A_Gen154 {
  		@com.google.inject.Inject
  		public A_Gen154(A_Gen155 a_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  