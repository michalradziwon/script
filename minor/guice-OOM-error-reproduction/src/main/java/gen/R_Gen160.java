
  package gen;
  public class R_Gen160 {
  		@com.google.inject.Inject
  		public R_Gen160(R_Gen161 r_gen161){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen161 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  