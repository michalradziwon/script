
  package gen;
  public class A_Gen134 {
  		@com.google.inject.Inject
  		public A_Gen134(A_Gen135 a_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  