
  package gen;
  public class U_Gen75 {
  		@com.google.inject.Inject
  		public U_Gen75(U_Gen76 u_gen76){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen76 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  