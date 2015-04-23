
  package gen;
  public class U_Gen161 {
  		@com.google.inject.Inject
  		public U_Gen161(U_Gen162 u_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  