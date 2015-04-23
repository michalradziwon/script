
  package gen;
  public class A_Gen129 {
  		@com.google.inject.Inject
  		public A_Gen129(A_Gen130 a_gen130){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen130 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  