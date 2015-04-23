
  package gen;
  public class R_Gen99 {
  		@com.google.inject.Inject
  		public R_Gen99(R_Gen100 r_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  