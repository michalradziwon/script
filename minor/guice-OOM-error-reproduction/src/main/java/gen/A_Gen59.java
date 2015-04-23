
  package gen;
  public class A_Gen59 {
  		@com.google.inject.Inject
  		public A_Gen59(A_Gen60 a_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  