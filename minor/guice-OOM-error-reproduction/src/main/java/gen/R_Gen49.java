
  package gen;
  public class R_Gen49 {
  		@com.google.inject.Inject
  		public R_Gen49(R_Gen50 r_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  