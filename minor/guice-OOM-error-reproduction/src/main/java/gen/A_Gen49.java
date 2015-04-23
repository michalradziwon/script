
  package gen;
  public class A_Gen49 {
  		@com.google.inject.Inject
  		public A_Gen49(A_Gen50 a_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  