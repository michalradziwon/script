
  package gen;
  public class A_Gen157 {
  		@com.google.inject.Inject
  		public A_Gen157(A_Gen158 a_gen158){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen158 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  