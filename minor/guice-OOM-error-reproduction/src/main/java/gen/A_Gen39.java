
  package gen;
  public class A_Gen39 {
  		@com.google.inject.Inject
  		public A_Gen39(A_Gen40 a_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  