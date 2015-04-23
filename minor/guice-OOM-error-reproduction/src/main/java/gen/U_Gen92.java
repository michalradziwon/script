
  package gen;
  public class U_Gen92 {
  		@com.google.inject.Inject
  		public U_Gen92(U_Gen93 u_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  