
  package gen;
  public class A_Gen66 {
  		@com.google.inject.Inject
  		public A_Gen66(A_Gen67 a_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  