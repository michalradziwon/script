
  package gen;
  public class R_Gen89 {
  		@com.google.inject.Inject
  		public R_Gen89(R_Gen90 r_gen90){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen90 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  