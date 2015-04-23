
  package gen;
  public class A_Gen32 {
  		@com.google.inject.Inject
  		public A_Gen32(A_Gen33 a_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  