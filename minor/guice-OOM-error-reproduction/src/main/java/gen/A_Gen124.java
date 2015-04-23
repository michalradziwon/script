
  package gen;
  public class A_Gen124 {
  		@com.google.inject.Inject
  		public A_Gen124(A_Gen125 a_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  