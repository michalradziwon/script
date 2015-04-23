
  package gen;
  public class A_Gen144 {
  		@com.google.inject.Inject
  		public A_Gen144(A_Gen145 a_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  