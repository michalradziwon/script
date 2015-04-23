
  package gen;
  public class U_Gen96 {
  		@com.google.inject.Inject
  		public U_Gen96(U_Gen97 u_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  