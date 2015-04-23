
  package gen;
  public class A_Gen28 {
  		@com.google.inject.Inject
  		public A_Gen28(A_Gen29 a_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  