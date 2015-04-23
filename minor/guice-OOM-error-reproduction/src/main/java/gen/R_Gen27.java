
  package gen;
  public class R_Gen27 {
  		@com.google.inject.Inject
  		public R_Gen27(R_Gen28 r_gen28){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen28 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  