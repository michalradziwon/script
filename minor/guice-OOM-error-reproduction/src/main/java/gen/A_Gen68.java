
  package gen;
  public class A_Gen68 {
  		@com.google.inject.Inject
  		public A_Gen68(A_Gen69 a_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  