
  package gen;
  public class U_Gen126 {
  		@com.google.inject.Inject
  		public U_Gen126(U_Gen127 u_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  