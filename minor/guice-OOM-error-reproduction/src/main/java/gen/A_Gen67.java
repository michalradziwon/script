
  package gen;
  public class A_Gen67 {
  		@com.google.inject.Inject
  		public A_Gen67(A_Gen68 a_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + a_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  