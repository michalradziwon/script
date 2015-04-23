
  package gen;
  public class L_Gen46 {
  		@com.google.inject.Inject
  		public L_Gen46(L_Gen47 l_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  