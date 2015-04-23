
  package gen;
  public class R_Gen46 {
  		@com.google.inject.Inject
  		public R_Gen46(R_Gen47 r_gen47){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen47 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  