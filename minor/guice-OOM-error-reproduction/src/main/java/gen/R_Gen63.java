
  package gen;
  public class R_Gen63 {
  		@com.google.inject.Inject
  		public R_Gen63(R_Gen64 r_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  