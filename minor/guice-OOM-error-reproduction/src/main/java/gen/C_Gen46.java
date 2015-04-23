
  package gen;
  public class C_Gen46 {
  		@com.google.inject.Inject
  		public C_Gen46(C_Gen47 c_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  