
  package gen;
  public class A_Gen147 {
  		@com.google.inject.Inject
  		public A_Gen147(A_Gen148 a_gen148){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen148 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  