
  package gen;
  public class A_Gen50 {
  		@com.google.inject.Inject
  		public A_Gen50(A_Gen51 a_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  