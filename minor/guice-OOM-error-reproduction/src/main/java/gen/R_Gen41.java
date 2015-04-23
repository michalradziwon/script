
  package gen;
  public class R_Gen41 {
  		@com.google.inject.Inject
  		public R_Gen41(R_Gen42 r_gen42){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen42 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  