
  package gen;
  public class U_Gen67 {
  		@com.google.inject.Inject
  		public U_Gen67(U_Gen68 u_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  