
  package gen;
  public class U_Gen138 {
  		@com.google.inject.Inject
  		public U_Gen138(U_Gen139 u_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  