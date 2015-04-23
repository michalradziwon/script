
  package gen;
  public class U_Gen16 {
  		@com.google.inject.Inject
  		public U_Gen16(U_Gen17 u_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  