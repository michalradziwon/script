
  package gen;
  public class A_Gen71 {
  		@com.google.inject.Inject
  		public A_Gen71(A_Gen72 a_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  