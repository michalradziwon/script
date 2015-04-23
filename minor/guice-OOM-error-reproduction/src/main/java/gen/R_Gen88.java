
  package gen;
  public class R_Gen88 {
  		@com.google.inject.Inject
  		public R_Gen88(R_Gen89 r_gen89){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen89 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  