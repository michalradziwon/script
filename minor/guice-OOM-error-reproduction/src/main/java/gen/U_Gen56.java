
  package gen;
  public class U_Gen56 {
  		@com.google.inject.Inject
  		public U_Gen56(U_Gen57 u_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  