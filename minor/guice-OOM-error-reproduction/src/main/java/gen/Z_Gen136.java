
  package gen;
  public class Z_Gen136 {
  		@com.google.inject.Inject
  		public Z_Gen136(Z_Gen137 z_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  