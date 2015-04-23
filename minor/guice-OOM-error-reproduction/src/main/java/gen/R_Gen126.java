
  package gen;
  public class R_Gen126 {
  		@com.google.inject.Inject
  		public R_Gen126(R_Gen127 r_gen127){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen127 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  