
  package gen;
  public class R_Gen134 {
  		@com.google.inject.Inject
  		public R_Gen134(R_Gen135 r_gen135){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen135 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  