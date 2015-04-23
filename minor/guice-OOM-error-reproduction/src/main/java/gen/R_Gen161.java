
  package gen;
  public class R_Gen161 {
  		@com.google.inject.Inject
  		public R_Gen161(R_Gen162 r_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  