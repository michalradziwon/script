
  package gen;
  public class U_Gen134 {
  		@com.google.inject.Inject
  		public U_Gen134(U_Gen135 u_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  