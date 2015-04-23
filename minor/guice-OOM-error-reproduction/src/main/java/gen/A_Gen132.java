
  package gen;
  public class A_Gen132 {
  		@com.google.inject.Inject
  		public A_Gen132(A_Gen133 a_gen133){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen133 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  