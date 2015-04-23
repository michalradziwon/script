
  package gen;
  public class S_Gen46 {
  		@com.google.inject.Inject
  		public S_Gen46(S_Gen47 s_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  