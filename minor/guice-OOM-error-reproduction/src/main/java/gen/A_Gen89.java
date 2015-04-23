
  package gen;
  public class A_Gen89 {
  		@com.google.inject.Inject
  		public A_Gen89(A_Gen90 a_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  