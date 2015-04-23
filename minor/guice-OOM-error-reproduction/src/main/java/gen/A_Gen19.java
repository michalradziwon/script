
  package gen;
  public class A_Gen19 {
  		@com.google.inject.Inject
  		public A_Gen19(A_Gen20 a_gen20){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen20 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  