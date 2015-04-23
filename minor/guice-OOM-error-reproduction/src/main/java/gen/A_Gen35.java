
  package gen;
  public class A_Gen35 {
  		@com.google.inject.Inject
  		public A_Gen35(A_Gen36 a_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  