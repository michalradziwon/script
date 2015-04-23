
  package gen;
  public class R_Gen87 {
  		@com.google.inject.Inject
  		public R_Gen87(R_Gen88 r_gen88){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen88 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  