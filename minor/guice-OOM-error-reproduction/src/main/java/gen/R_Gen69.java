
  package gen;
  public class R_Gen69 {
  		@com.google.inject.Inject
  		public R_Gen69(R_Gen70 r_gen70){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen70 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  