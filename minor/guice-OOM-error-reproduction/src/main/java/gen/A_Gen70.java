
  package gen;
  public class A_Gen70 {
  		@com.google.inject.Inject
  		public A_Gen70(A_Gen71 a_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  