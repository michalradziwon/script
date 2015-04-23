
  package gen;
  public class A_Gen179 {
  		@com.google.inject.Inject
  		public A_Gen179(A_Gen180 a_gen180){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen180 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  