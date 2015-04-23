
  package gen;
  public class U_Gen187 {
  		@com.google.inject.Inject
  		public U_Gen187(U_Gen188 u_gen188){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen188 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  