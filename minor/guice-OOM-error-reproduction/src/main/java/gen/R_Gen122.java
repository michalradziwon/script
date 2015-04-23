
  package gen;
  public class R_Gen122 {
  		@com.google.inject.Inject
  		public R_Gen122(R_Gen123 r_gen123){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen123 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  