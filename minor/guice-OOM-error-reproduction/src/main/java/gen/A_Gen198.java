
  package gen;
  public class A_Gen198 {
  		@com.google.inject.Inject
  		public A_Gen198(A_Gen199 a_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  