
  package gen;
  public class R_Gen182 {
  		@com.google.inject.Inject
  		public R_Gen182(R_Gen183 r_gen183){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen183 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  