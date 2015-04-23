
  package gen;
  public class A_Gen52 {
  		@com.google.inject.Inject
  		public A_Gen52(A_Gen53 a_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  