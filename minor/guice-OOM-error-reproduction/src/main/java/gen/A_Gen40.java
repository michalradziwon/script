
  package gen;
  public class A_Gen40 {
  		@com.google.inject.Inject
  		public A_Gen40(A_Gen41 a_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  