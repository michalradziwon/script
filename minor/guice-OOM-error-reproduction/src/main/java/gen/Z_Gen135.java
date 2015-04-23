
  package gen;
  public class Z_Gen135 {
  		@com.google.inject.Inject
  		public Z_Gen135(Z_Gen136 z_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  