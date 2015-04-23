
  package gen;
  public class A_Gen31 {
  		@com.google.inject.Inject
  		public A_Gen31(A_Gen32 a_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  