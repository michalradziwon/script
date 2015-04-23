
  package gen;
  public class I_Gen136 {
  		@com.google.inject.Inject
  		public I_Gen136(I_Gen137 i_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  