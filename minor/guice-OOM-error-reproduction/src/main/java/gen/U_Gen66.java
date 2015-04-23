
  package gen;
  public class U_Gen66 {
  		@com.google.inject.Inject
  		public U_Gen66(U_Gen67 u_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  