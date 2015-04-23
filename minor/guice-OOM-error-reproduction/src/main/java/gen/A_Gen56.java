
  package gen;
  public class A_Gen56 {
  		@com.google.inject.Inject
  		public A_Gen56(A_Gen57 a_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  