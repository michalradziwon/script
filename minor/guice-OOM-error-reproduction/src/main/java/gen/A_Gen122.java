
  package gen;
  public class A_Gen122 {
  		@com.google.inject.Inject
  		public A_Gen122(A_Gen123 a_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  