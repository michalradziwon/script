
  package gen;
  public class U_Gen144 {
  		@com.google.inject.Inject
  		public U_Gen144(U_Gen145 u_gen145){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen145 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  