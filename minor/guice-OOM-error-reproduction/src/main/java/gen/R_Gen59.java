
  package gen;
  public class R_Gen59 {
  		@com.google.inject.Inject
  		public R_Gen59(R_Gen60 r_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  