
  package gen;
  public class A_Gen83 {
  		@com.google.inject.Inject
  		public A_Gen83(A_Gen84 a_gen84){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen84 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  