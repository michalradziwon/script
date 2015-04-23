
  package gen;
  public class A_Gen149 {
  		@com.google.inject.Inject
  		public A_Gen149(A_Gen150 a_gen150){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen150 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  