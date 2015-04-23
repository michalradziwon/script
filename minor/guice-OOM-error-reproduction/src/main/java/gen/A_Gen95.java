
  package gen;
  public class A_Gen95 {
  		@com.google.inject.Inject
  		public A_Gen95(A_Gen96 a_gen96){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen96 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  