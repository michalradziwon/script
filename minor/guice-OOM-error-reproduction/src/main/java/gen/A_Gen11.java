
  package gen;
  public class A_Gen11 {
  		@com.google.inject.Inject
  		public A_Gen11(A_Gen12 a_gen12){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen12 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  