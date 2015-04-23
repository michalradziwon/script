
  package gen;
  public class R_Gen78 {
  		@com.google.inject.Inject
  		public R_Gen78(R_Gen79 r_gen79){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen79 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  