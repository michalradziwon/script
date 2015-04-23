
  package gen;
  public class R_Gen131 {
  		@com.google.inject.Inject
  		public R_Gen131(R_Gen132 r_gen132){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen132 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  