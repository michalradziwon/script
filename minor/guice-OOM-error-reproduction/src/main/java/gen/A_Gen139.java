
  package gen;
  public class A_Gen139 {
  		@com.google.inject.Inject
  		public A_Gen139(A_Gen140 a_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  