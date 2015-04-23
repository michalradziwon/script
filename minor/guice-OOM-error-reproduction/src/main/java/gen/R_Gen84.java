
  package gen;
  public class R_Gen84 {
  		@com.google.inject.Inject
  		public R_Gen84(R_Gen85 r_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  