
  package gen;
  public class U_Gen136 {
  		@com.google.inject.Inject
  		public U_Gen136(U_Gen137 u_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + u_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  