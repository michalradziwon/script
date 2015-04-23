
  package gen;
  public class R_Gen32 {
  		@com.google.inject.Inject
  		public R_Gen32(R_Gen33 r_gen33){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen33 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  