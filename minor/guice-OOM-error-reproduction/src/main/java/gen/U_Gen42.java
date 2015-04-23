
  package gen;
  public class U_Gen42 {
  		@com.google.inject.Inject
  		public U_Gen42(U_Gen43 u_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  