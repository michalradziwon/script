
  package gen;
  public class U_Gen38 {
  		@com.google.inject.Inject
  		public U_Gen38(U_Gen39 u_gen39){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen39 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  