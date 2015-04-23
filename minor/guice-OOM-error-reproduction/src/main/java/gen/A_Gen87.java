
  package gen;
  public class A_Gen87 {
  		@com.google.inject.Inject
  		public A_Gen87(A_Gen88 a_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  