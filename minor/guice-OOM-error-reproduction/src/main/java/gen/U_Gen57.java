
  package gen;
  public class U_Gen57 {
  		@com.google.inject.Inject
  		public U_Gen57(U_Gen58 u_gen58){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen58 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  