
  package gen;
  public class A_Gen199 {
  		@com.google.inject.Inject
  		public A_Gen199(A_Gen200 a_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  