
  package gen;
  public class A_Gen93 {
  		@com.google.inject.Inject
  		public A_Gen93(A_Gen94 a_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  