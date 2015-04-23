
  package gen;
  public class U_Gen145 {
  		@com.google.inject.Inject
  		public U_Gen145(U_Gen146 u_gen146){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen146 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  