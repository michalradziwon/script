
  package gen;
  public class R_Gen169 {
  		@com.google.inject.Inject
  		public R_Gen169(R_Gen170 r_gen170){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen170 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  