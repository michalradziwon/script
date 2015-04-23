
  package gen;
  public class R_Gen24 {
  		@com.google.inject.Inject
  		public R_Gen24(R_Gen25 r_gen25){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen25 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  