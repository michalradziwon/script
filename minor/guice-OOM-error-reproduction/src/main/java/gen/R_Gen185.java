
  package gen;
  public class R_Gen185 {
  		@com.google.inject.Inject
  		public R_Gen185(R_Gen186 r_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  