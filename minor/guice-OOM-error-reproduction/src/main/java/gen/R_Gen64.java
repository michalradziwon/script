
  package gen;
  public class R_Gen64 {
  		@com.google.inject.Inject
  		public R_Gen64(R_Gen65 r_gen65){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen65 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  