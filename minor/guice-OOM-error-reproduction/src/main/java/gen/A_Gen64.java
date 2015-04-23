
  package gen;
  public class A_Gen64 {
  		@com.google.inject.Inject
  		public A_Gen64(A_Gen65 a_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  