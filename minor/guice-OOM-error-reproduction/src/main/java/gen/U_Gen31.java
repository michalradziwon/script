
  package gen;
  public class U_Gen31 {
  		@com.google.inject.Inject
  		public U_Gen31(U_Gen32 u_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  