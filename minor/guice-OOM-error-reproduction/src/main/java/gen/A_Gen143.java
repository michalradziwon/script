
  package gen;
  public class A_Gen143 {
  		@com.google.inject.Inject
  		public A_Gen143(A_Gen144 a_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  