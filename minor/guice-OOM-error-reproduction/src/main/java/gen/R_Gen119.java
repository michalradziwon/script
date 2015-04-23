
  package gen;
  public class R_Gen119 {
  		@com.google.inject.Inject
  		public R_Gen119(R_Gen120 r_gen120){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen120 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  