
  package gen;
  public class A_Gen34 {
  		@com.google.inject.Inject
  		public A_Gen34(A_Gen35 a_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  