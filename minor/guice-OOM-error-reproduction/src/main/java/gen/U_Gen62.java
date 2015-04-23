
  package gen;
  public class U_Gen62 {
  		@com.google.inject.Inject
  		public U_Gen62(U_Gen63 u_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  