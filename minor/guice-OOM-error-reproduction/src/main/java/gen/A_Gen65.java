
  package gen;
  public class A_Gen65 {
  		@com.google.inject.Inject
  		public A_Gen65(A_Gen66 a_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  