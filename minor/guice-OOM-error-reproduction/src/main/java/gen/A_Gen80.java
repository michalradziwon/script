
  package gen;
  public class A_Gen80 {
  		@com.google.inject.Inject
  		public A_Gen80(A_Gen81 a_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  