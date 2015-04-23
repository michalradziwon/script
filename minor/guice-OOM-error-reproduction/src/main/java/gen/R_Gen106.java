
  package gen;
  public class R_Gen106 {
  		@com.google.inject.Inject
  		public R_Gen106(R_Gen107 r_gen107){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen107 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  