
  package gen;
  public class U_Gen9 {
  		@com.google.inject.Inject
  		public U_Gen9(U_Gen10 u_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  