
  package gen;
  public class U_Gen68 {
  		@com.google.inject.Inject
  		public U_Gen68(U_Gen69 u_gen69){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen69 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  