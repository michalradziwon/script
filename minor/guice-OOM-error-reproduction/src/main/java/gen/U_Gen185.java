
  package gen;
  public class U_Gen185 {
  		@com.google.inject.Inject
  		public U_Gen185(U_Gen186 u_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  