
  package gen;
  public class R_Gen109 {
  		@com.google.inject.Inject
  		public R_Gen109(R_Gen110 r_gen110){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen110 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  