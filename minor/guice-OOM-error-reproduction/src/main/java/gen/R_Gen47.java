
  package gen;
  public class R_Gen47 {
  		@com.google.inject.Inject
  		public R_Gen47(R_Gen48 r_gen48){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen48 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  