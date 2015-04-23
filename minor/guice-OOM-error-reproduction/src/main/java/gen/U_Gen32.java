
  package gen;
  public class U_Gen32 {
  		@com.google.inject.Inject
  		public U_Gen32(U_Gen33 u_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  