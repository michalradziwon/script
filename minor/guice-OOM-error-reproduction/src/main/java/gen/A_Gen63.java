
  package gen;
  public class A_Gen63 {
  		@com.google.inject.Inject
  		public A_Gen63(A_Gen64 a_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  