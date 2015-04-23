
  package gen;
  public class R_Gen136 {
  		@com.google.inject.Inject
  		public R_Gen136(R_Gen137 r_gen137){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen137 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  