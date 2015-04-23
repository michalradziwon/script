
  package gen;
  public class A_Gen47 {
  		@com.google.inject.Inject
  		public A_Gen47(A_Gen48 a_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  