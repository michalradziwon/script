
  package gen;
  public class R_Gen166 {
  		@com.google.inject.Inject
  		public R_Gen166(R_Gen167 r_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  