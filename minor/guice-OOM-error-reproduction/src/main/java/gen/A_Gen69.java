
  package gen;
  public class A_Gen69 {
  		@com.google.inject.Inject
  		public A_Gen69(A_Gen70 a_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  