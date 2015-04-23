
  package gen;
  public class R_Gen90 {
  		@com.google.inject.Inject
  		public R_Gen90(R_Gen91 r_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  