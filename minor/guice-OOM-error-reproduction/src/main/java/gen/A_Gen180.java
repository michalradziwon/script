
  package gen;
  public class A_Gen180 {
  		@com.google.inject.Inject
  		public A_Gen180(A_Gen181 a_gen181){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen181 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  