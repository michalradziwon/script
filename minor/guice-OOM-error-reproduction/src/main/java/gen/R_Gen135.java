
  package gen;
  public class R_Gen135 {
  		@com.google.inject.Inject
  		public R_Gen135(R_Gen136 r_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  