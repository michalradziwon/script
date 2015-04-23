
  package gen;
  public class U_Gen169 {
  		@com.google.inject.Inject
  		public U_Gen169(U_Gen170 u_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  