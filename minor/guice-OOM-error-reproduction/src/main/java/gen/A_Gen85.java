
  package gen;
  public class A_Gen85 {
  		@com.google.inject.Inject
  		public A_Gen85(A_Gen86 a_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  