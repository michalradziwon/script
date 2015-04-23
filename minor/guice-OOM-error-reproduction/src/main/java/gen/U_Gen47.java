
  package gen;
  public class U_Gen47 {
  		@com.google.inject.Inject
  		public U_Gen47(U_Gen48 u_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  