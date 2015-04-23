
  package gen;
  public class P_Gen46 {
  		@com.google.inject.Inject
  		public P_Gen46(P_Gen47 p_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  