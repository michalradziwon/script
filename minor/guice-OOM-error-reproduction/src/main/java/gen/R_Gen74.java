
  package gen;
  public class R_Gen74 {
  		@com.google.inject.Inject
  		public R_Gen74(R_Gen75 r_gen75){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen75 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  