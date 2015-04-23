
  package gen;
  public class R_Gen16 {
  		@com.google.inject.Inject
  		public R_Gen16(R_Gen17 r_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  