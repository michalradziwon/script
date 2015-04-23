
  package gen;
  public class R_Gen9 {
  		@com.google.inject.Inject
  		public R_Gen9(R_Gen10 r_gen10){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen10 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  