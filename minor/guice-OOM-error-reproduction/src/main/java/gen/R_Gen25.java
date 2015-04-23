
  package gen;
  public class R_Gen25 {
  		@com.google.inject.Inject
  		public R_Gen25(R_Gen26 r_gen26){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen26 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  