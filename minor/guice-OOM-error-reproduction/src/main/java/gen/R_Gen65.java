
  package gen;
  public class R_Gen65 {
  		@com.google.inject.Inject
  		public R_Gen65(R_Gen66 r_gen66){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen66 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  