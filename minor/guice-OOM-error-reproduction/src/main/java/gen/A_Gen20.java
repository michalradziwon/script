
  package gen;
  public class A_Gen20 {
  		@com.google.inject.Inject
  		public A_Gen20(A_Gen21 a_gen21){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen21 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  