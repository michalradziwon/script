
  package gen;
  public class A_Gen161 {
  		@com.google.inject.Inject
  		public A_Gen161(A_Gen162 a_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  