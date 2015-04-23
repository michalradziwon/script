
  package gen;
  public class R_Gen138 {
  		@com.google.inject.Inject
  		public R_Gen138(R_Gen139 r_gen139){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen139 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  