
  package gen;
  public class R_Gen97 {
  		@com.google.inject.Inject
  		public R_Gen97(R_Gen98 r_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  