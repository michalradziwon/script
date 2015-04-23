
  package gen;
  public class A_Gen97 {
  		@com.google.inject.Inject
  		public A_Gen97(A_Gen98 a_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  