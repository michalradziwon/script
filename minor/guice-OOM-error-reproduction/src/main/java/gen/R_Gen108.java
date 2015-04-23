
  package gen;
  public class R_Gen108 {
  		@com.google.inject.Inject
  		public R_Gen108(R_Gen109 r_gen109){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen109 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  