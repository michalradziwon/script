
  package gen;
  public class A_Gen197 {
  		@com.google.inject.Inject
  		public A_Gen197(A_Gen198 a_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  