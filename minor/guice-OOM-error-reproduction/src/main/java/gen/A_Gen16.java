
  package gen;
  public class A_Gen16 {
  		@com.google.inject.Inject
  		public A_Gen16(A_Gen17 a_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  