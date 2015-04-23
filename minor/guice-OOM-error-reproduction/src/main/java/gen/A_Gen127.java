
  package gen;
  public class A_Gen127 {
  		@com.google.inject.Inject
  		public A_Gen127(A_Gen128 a_gen128){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen128 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  