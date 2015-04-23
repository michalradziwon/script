
  package gen;
  public class A_Gen169 {
  		@com.google.inject.Inject
  		public A_Gen169(A_Gen170 a_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  