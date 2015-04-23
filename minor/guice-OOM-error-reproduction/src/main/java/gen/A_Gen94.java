
  package gen;
  public class A_Gen94 {
  		@com.google.inject.Inject
  		public A_Gen94(A_Gen95 a_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  