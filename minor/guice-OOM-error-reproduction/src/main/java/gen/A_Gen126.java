
  package gen;
  public class A_Gen126 {
  		@com.google.inject.Inject
  		public A_Gen126(A_Gen127 a_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  