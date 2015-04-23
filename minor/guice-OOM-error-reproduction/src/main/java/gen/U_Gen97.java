
  package gen;
  public class U_Gen97 {
  		@com.google.inject.Inject
  		public U_Gen97(U_Gen98 u_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  