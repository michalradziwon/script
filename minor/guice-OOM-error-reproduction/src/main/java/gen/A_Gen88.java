
  package gen;
  public class A_Gen88 {
  		@com.google.inject.Inject
  		public A_Gen88(A_Gen89 a_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  