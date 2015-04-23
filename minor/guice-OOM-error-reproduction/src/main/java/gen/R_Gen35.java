
  package gen;
  public class R_Gen35 {
  		@com.google.inject.Inject
  		public R_Gen35(R_Gen36 r_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  