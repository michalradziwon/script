
  package gen;
  public class A_Gen185 {
  		@com.google.inject.Inject
  		public A_Gen185(A_Gen186 a_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  