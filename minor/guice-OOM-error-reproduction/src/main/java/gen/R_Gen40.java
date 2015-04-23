
  package gen;
  public class R_Gen40 {
  		@com.google.inject.Inject
  		public R_Gen40(R_Gen41 r_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  