
  package gen;
  public class R_Gen148 {
  		@com.google.inject.Inject
  		public R_Gen148(R_Gen149 r_gen149){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen149 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  