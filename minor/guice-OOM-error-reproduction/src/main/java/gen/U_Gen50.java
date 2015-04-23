
  package gen;
  public class U_Gen50 {
  		@com.google.inject.Inject
  		public U_Gen50(U_Gen51 u_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  