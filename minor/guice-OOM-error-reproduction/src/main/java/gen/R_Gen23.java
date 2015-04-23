
  package gen;
  public class R_Gen23 {
  		@com.google.inject.Inject
  		public R_Gen23(R_Gen24 r_gen24){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen24 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  