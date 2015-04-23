
  package gen;
  public class A_Gen62 {
  		@com.google.inject.Inject
  		public A_Gen62(A_Gen63 a_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  