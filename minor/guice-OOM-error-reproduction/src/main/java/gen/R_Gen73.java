
  package gen;
  public class R_Gen73 {
  		@com.google.inject.Inject
  		public R_Gen73(R_Gen74 r_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  