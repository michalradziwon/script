
  package gen;
  public class A_Gen112 {
  		@com.google.inject.Inject
  		public A_Gen112(A_Gen113 a_gen113){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen113 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  