
  package gen;
  public class U_Gen27 {
  		@com.google.inject.Inject
  		public U_Gen27(U_Gen28 u_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  