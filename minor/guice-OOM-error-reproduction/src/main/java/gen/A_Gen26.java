
  package gen;
  public class A_Gen26 {
  		@com.google.inject.Inject
  		public A_Gen26(A_Gen27 a_gen27){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen27 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  