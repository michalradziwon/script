
  package gen;
  public class A_Gen36 {
  		@com.google.inject.Inject
  		public A_Gen36(A_Gen37 a_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  