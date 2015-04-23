
  package gen;
  public class A_Gen79 {
  		@com.google.inject.Inject
  		public A_Gen79(A_Gen80 a_gen80){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen80 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  