
  package gen;
  public class U_Gen125 {
  		@com.google.inject.Inject
  		public U_Gen125(U_Gen126 u_gen126){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen126 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  