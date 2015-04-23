
  package gen;
  public class A_Gen111 {
  		@com.google.inject.Inject
  		public A_Gen111(A_Gen112 a_gen112){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen112 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  