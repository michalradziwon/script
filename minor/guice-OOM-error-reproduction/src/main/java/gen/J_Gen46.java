
  package gen;
  public class J_Gen46 {
  		@com.google.inject.Inject
  		public J_Gen46(J_Gen47 j_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  