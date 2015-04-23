
  package gen;
  public class U_Gen39 {
  		@com.google.inject.Inject
  		public U_Gen39(U_Gen40 u_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  