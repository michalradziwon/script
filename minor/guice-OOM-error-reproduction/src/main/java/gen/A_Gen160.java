
  package gen;
  public class A_Gen160 {
  		@com.google.inject.Inject
  		public A_Gen160(A_Gen161 a_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  