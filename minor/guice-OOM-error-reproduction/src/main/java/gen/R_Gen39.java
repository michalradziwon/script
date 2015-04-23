
  package gen;
  public class R_Gen39 {
  		@com.google.inject.Inject
  		public R_Gen39(R_Gen40 r_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  