
  package gen;
  public class A_Gen146 {
  		@com.google.inject.Inject
  		public A_Gen146(A_Gen147 a_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  