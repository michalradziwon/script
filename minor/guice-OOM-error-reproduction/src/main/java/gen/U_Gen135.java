
  package gen;
  public class U_Gen135 {
  		@com.google.inject.Inject
  		public U_Gen135(U_Gen136 u_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  