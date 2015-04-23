
  package gen;
  public class A_Gen37 {
  		@com.google.inject.Inject
  		public A_Gen37(A_Gen38 a_gen38){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen38 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  