
  package gen;
  public class R_Gen50 {
  		@com.google.inject.Inject
  		public R_Gen50(R_Gen51 r_gen51){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen51 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  