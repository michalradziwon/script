
  package gen;
  public class R_Gen139 {
  		@com.google.inject.Inject
  		public R_Gen139(R_Gen140 r_gen140){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen140 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  