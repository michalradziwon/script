
  package gen;
  public class A_Gen133 {
  		@com.google.inject.Inject
  		public A_Gen133(A_Gen134 a_gen134){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen134 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  