
  package gen;
  public class A_Gen140 {
  		@com.google.inject.Inject
  		public A_Gen140(A_Gen141 a_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  