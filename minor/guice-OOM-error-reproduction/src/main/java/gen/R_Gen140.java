
  package gen;
  public class R_Gen140 {
  		@com.google.inject.Inject
  		public R_Gen140(R_Gen141 r_gen141){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen141 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  