
  package gen;
  public class A_Gen12 {
  		@com.google.inject.Inject
  		public A_Gen12(A_Gen13 a_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  