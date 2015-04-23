
  package gen;
  public class U_Gen41 {
  		@com.google.inject.Inject
  		public U_Gen41(U_Gen42 u_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  