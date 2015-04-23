
  package gen;
  public class I_Gen135 {
  		@com.google.inject.Inject
  		public I_Gen135(I_Gen136 i_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + i_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  