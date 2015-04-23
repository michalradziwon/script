
  package gen;
  public class R_Gen77 {
  		@com.google.inject.Inject
  		public R_Gen77(R_Gen78 r_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  