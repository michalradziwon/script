
  package gen;
  public class R_Gen36 {
  		@com.google.inject.Inject
  		public R_Gen36(R_Gen37 r_gen37){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen37 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  