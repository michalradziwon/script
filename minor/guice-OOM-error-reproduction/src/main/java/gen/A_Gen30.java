
  package gen;
  public class A_Gen30 {
  		@com.google.inject.Inject
  		public A_Gen30(A_Gen31 a_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  