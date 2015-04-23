
  package gen;
  public class C_Gen136 {
  		@com.google.inject.Inject
  		public C_Gen136(C_Gen137 c_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  