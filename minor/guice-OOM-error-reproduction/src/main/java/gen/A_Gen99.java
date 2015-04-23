
  package gen;
  public class A_Gen99 {
  		@com.google.inject.Inject
  		public A_Gen99(A_Gen100 a_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  